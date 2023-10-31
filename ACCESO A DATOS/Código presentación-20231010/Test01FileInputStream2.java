package manejoFicheros;
import java.io.FileInputStream;
import java.io.IOException;

public class Test01FileInputStream2 {
    public static void main(String[] args) {
        try (FileInputStream fip =
                     new FileInputStream("ficheros/nuevoFichero.dat")) {
            int byteLeido;
            while (fip.available()>0) { // mientras tengamos bytes
                // leemos contenido byte a byte
                byteLeido = fip.read();
                // como sabemos que guardamos caracteres,
                // convertimos el valor a carácter
                char caracterLeido = (char) byteLeido;
                System.out.printf("%c",caracterLeido);
            }
            System.out.println("\nFichero leido con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}