package manejoFicheros;
import java.io.FileInputStream;
import java.io.IOException;

public class Test01FileInputStream {
    public static void main(String[] args) {
        try (FileInputStream fip =
                     new FileInputStream("ficheros/nuevoFichero.dat")) {
            // leemos contenido byte a byte
            int byteLeido = fip.read(); //primer byte
            while ( byteLeido != -1) { // cuando llegue a EOF devuelve -1
                // como sabemos que guardamos caracteres,
                // convertimos el valor a carácter
                char caracterLeido = (char) byteLeido;
                System.out.printf("%c",caracterLeido);
                byteLeido = fip.read();
            }
            System.out.println("\nFichero leido con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}