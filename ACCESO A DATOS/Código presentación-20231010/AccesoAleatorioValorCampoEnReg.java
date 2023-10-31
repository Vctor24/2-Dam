package manejoFicheros;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;
public class AccesoAleatorioValorCampoEnReg {
    // descriptor del fichero (util para luego averigurar el Path
    private final File f;
    private final RandomAccessFile faa;
    // Estructura del registro, viene representado por
    // una Lista de Pares de valores (nombre_campo,tama_campo)
    private final Set<SimpleEntry<String, Integer>> campos;
    // tamaño del registro viene dado por la suma de los tamaños de los campos
    private long longReg;
    //numero total de registros contenido en el fichero
    private long numReg = 0;

    /**
     * Getter para Fichero
     * @return el descriptor del fichero abierto
     */
    public File getFichero() {
        return f;
    }

    /**
     * Constructor de la clase AccesoAleatorioValorCampoEnReg
     * @param nomFich cadena con el fichero que queremos acceder
     * @param campos Estructra del registro, dada por una Lista de campos
     *               formada por pares de valores (nombre_campo,valor_campo)
     * @throws IOException para el tratamiento de los errores al manipular
     * el fichero nomFich
     */
    public AccesoAleatorioValorCampoEnReg(String nomFich, Set<SimpleEntry<String,
            Integer>> campos) throws IOException {
        this.campos = campos;
        this.f = new File(nomFich);
        faa = new RandomAccessFile(f, "rws");
        longReg = 0;
        for (SimpleEntry<String, Integer> campo : campos) {
            this.longReg += campo.getValue();
        }
        if (f.exists()) {
            this.numReg = f.length() / this.longReg;
        }
    }

    /**
     * Getter para obtener el numero de registros que hay en fichero
     * @return valore entero con el total de registros
     */
    public long getNumReg() {
        return this.numReg;
    }

    /**
     * Insertamos un mapa que contiene un registro
     * @param reg Diccionario con clave: nombre de campo y key: valor del campo
     * @throws IOException si hay problemas al escribir en el fichero
     */
    public void insertar(Map<String, String> reg) throws IOException {
        insertar(reg, this.numReg++);
    }

    /**
     * Insertamos un mapa que contiene un registro al final del archivo
     * a no ser que se indiqie una posición mas grande que los registros existentes
     * @param reg Diccionario con clave: nombre de campo y key: valor del campo
     * @param pos posición donde se desearía grabar
     *            (no inserta en medio, sobreescribe el registro que haya)
     * @throws IOException si hay problemas al escribir en el fichero
     * return -1 si la posición es mayor a los registros que hay en caso contrario
     * devuelve la posicion donde se ha añadido
     */
    long insertar(Map<String, String> reg, long pos) throws IOException {
        if (pos > this.numReg) {
            return (long) -1;
        }
        else if (pos == this.numReg) {
            this.numReg++;
        }
        faa.seek(pos * this.longReg);
        for (SimpleEntry<String, Integer> campo : this.campos) {
            String nomCampo = campo.getKey();
            Integer longCampo = campo.getValue();
            String valorCampo = reg.get(nomCampo);
            if (valorCampo == null) {
                valorCampo = "";
            }
            String valorCampoForm = String.format("%-" + longCampo + "s", valorCampo);
            faa.write(valorCampoForm.getBytes("UTF-8"), 0, longCampo);
        }
        return pos;
    }

    /**
     * Lee el valor de un campo de un de terminado registro del fichero
     * @param pos posición del registro
     * @param nomCampo nombre del campo que deseamos obtener el valor
     * @return null si no encontramos el campo o llegamos al final del archivo.
     *          Lo normal es que devuelva el valor del campo que buscabamos
     * @throws IOException
     */
    String obtenValorCampo(long pos, String nomCampo) throws IOException {
        if (pos > this.numReg) {
            return null;
        }
        faa.seek(pos * this.longReg);
        for (SimpleEntry<String, Integer> campo : this.campos) {  // Lee campo a campo
            String nombreCampo = campo.getKey();
            int tamaCampo = campo.getValue();
            byte[] bytesEnCampo = new byte[tamaCampo];
            // si leemos menos bytes es porque hemos llegado a eof
            // eso significa que el fichero no tiene la estructura adecuada
            if (faa.read(bytesEnCampo) < tamaCampo) {
                return null;
            }
            // si este es el campo que queremos
            if (nombreCampo.equals(nomCampo)) {
                // Texto codificado en UTF-8 (método insertar)
                return new String(bytesEnCampo, StandardCharsets.UTF_8);
            }
        }
        return null;  // Si no se encuentra el campo con nombre dado
    }

}
