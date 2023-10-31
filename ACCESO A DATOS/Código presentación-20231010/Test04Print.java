package manejoFicheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test04Print {
    public static void main(String[] arg) throws Exception{
        try (PrintStream output = new PrintStream(
            new FileOutputStream(new File("ficheros/usoPrintStream.txt")))) {
            output.println(true);
            output.println((int) 123);
            output.println((float) 123.456);
            output.printf("%.2f\n", 12.3698);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
