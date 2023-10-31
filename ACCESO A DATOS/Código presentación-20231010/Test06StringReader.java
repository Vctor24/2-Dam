package manejoFicheros;

import java.io.IOException;
import java.io.StringReader;

public class Test06StringReader {
    public static void main(String[] args) {
        String texto = "Ejemplo de StringReader en Java";
        try (StringReader sr = new StringReader(texto)) {
            // Leer caracteres de StringReader e imprimir en la consola
            int character;
            while ((character = sr.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
    }
}
