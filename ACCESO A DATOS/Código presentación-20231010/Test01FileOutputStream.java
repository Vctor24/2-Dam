package manejoFicheros;

import java.io.FileOutputStream;
import java.io.IOException;


public class Test01FileOutputStream {
    public static void main(String[] args) {
        try (FileOutputStream fop =
                     new FileOutputStream("ficheros/nuevoFichero.dat")) {
            String content = "Hola mundo, ......!!\r\n";
            // Cogemos el contenido en bytes
            byte[] contentInBytes = content.getBytes();
            fop.write(contentInBytes);
            fop.write("Pepe\r\n".getBytes());
            System.out.println("Fichero creado con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
