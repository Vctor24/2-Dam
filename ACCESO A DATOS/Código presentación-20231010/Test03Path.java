package manejoFicheros;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test03Path {
    public static void main(String[] args) {
        //Creamos una ruta  para  crear  un fichero
        Path path = Paths.get("ficheros", "path.txt");
        //Creamos un fichero, y abrimos el flujo de texto para escribir
        try(BufferedWriter bw = Files.newBufferedWriter(path)) {
            bw.write("escritura de una cadena  usando   buffered");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Copiamos el fichero
        Path copia = Paths.get("ficheros", "fichero_copiado.txt");
        try {
            Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
            //Lo  movemos fuera del directorio
            Files.move(copia, Paths.get("ficheros", "copiado.txt"), StandardCopyOption.REPLACE_EXISTING);
            //Lo eliminamos
            Files.deleteIfExists(Paths.get("ficheros", "copiado.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
