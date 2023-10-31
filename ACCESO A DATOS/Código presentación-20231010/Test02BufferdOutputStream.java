package manejoFicheros;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02BufferdOutputStream {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("ficheros/nuevoFicheroBuffer.dat"))){
            String buffer = "Hola mundo!";
            bos.write(buffer.getBytes());
            bos.write(System.lineSeparator().getBytes());//añadir salto de linea
            bos.write("Escribiendo en un fichero usando un BufferedOutputStream".getBytes());
            bos.write(System.lineSeparator().getBytes());
            bos.flush();  // se vuelca al fichero el buffer
            bos.write("Probando, probando".getBytes());
            bos.write(System.lineSeparator().getBytes());//añadir salto de linea
            bos.write("1,2,3,4... se me escucha...".getBytes());
            bos.write(System.lineSeparator().getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

