package manejoFicheros;

import java.io.IOException;
import java.util.*;

public class TestAccesoAleatorioValorCampoEnReg {
    public static void main(String[] args) {
        // usamos una estructura LinkedHashSet porque quiero que los campos no se puedan repetir
        // y se lean y escriban en el fichero simpre en este orden
        Set campos = new LinkedHashSet<AbstractMap.SimpleEntry<String,Integer>>();
        campos.add(new AbstractMap.SimpleEntry("DNI", 9));
        campos.add(new AbstractMap.SimpleEntry("NOMBRE", 32));
        campos.add(new AbstractMap.SimpleEntry("CP", 5));

        try {
            AccesoAleatorioValorCampoEnReg faa =
                    new AccesoAleatorioValorCampoEnReg("ficheros/ficAccesoAleat.dat", campos);
            Map reg = new HashMap();
            reg.put("DNI", "56789012B");
            reg.put("CP", "29730");
            reg.put("NOMBRE", "SAMPER");
            faa.insertar(reg);
            reg.clear();
            reg.put("DNI", "89012345E");
            reg.put("NOMBRE", "ROJAS");
            faa.insertar(reg);
            reg.clear();
            reg.put("DNI", "23456789D");
            reg.put("NOMBRE", "DORCE");
            reg.put("CP", "13700");
            faa.insertar(reg);
            reg.clear();
            reg.put("DNI", "78901234X");
            reg.put("NOMBRE", "NADALES");
            reg.put("CP", "44126");
            faa.insertar(reg, 1);
            reg.clear();
            reg.put("DNI", "12345678Z");
            reg.put("NOMBRE", "ARCOS");
            long pos = 1;
            if (faa.insertar(reg, pos) < 0) {
                System.err.println("No se pudo insertar registro en posición " + pos);
            }
            System.out.println("Fichero " + faa.getFichero().getAbsolutePath()
                    + " contiene " + faa.getNumReg() + " registros.");
            String nomCampo="NOMBRE"; // Se escribe valor de este campo del último al primer registro
            for(long i = faa.getNumReg()-1; i>=0; i--) {
                System.out.println("Registro "+i+", "+nomCampo+":"+faa.obtenValorCampo(i, nomCampo));
            }
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
