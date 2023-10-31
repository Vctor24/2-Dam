package manejoFicheros;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test07BufferOuputStreamWriter {
    public static void main(String[] args) {
        // Nombre del archivo en el que deseas escribir
        String fileName = "ficheros/codificacion.txt";
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileName), "ISO-8859-1"))) {
            // Escribir texto en el archivo utilizando la codificación ISO-8859-1
            String texto = "Hola, mundo Ç ñ ä Ï en ISO-8859-1";
            bw.write(texto);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
