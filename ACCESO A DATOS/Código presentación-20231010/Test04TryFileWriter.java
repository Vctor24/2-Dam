package manejoFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class Test04TryFileWriter {
    public static void main(String[] args) {
        String intro = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme";
        try (FileWriter fw = new FileWriter("ficheros/IntroQuijote.txt")) {
            for(char c : intro.toCharArray())
                fw.write(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
