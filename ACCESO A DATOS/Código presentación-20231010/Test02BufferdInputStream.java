package manejoFicheros;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02BufferdInputStream {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("ficheros/nuevoFicheroBuffer.dat"))){
            // array de bytes para almacenar los datos leídos
            byte[] buffer = new byte[512];
            int bytesRead; // tamaño en bytesLeidos
            while ((bytesRead = bis.read(buffer))!=-1){
                System.out.write(buffer,0,bytesRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
