package manejoFicheros;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test07BufferInputStreamReader {
    public static void main(String[] args) {
        // Nombre del archivo que deseas leer
        String fileName = "ficheros/codificacion.txt";
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName), "ISO-8859-1"))) {
            String line;
            // Leer y mostrar el contenido del archivo línea por línea
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
