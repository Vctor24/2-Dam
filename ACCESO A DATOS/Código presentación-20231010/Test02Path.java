package manejoFicheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02Path {
    public static void main(String[] args) {
        Path path  = Paths.get(System.getProperty("user.home"),
                "Desktop","java", "temario.txt");
        if (Files.notExists(path)) {
            System.out.println("La ruta no existe, creando...");
            try {
                // tiene que existir la carpeta, crear el fichero
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (Files.exists(path))
            System.out.println("La ruta sí existe");

    }
}
