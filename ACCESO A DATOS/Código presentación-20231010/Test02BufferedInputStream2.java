package manejoFicheros;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02BufferedInputStream2 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("ficheros/nuevoFicheroBuffer.dat"))){
            // array de bytes para almacenar los datos leídos
            byte[] buffer = new byte[512];
            int bytesRead; // tamaño en bytesLeidos
            while ((bytesRead = bis.read(buffer))!=-1){
                String contenido = new String(buffer,0,bytesRead);
                System.out.println(contenido);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
