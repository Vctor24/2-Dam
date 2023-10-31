package manejoFicheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test04FileReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("ficheros/IntroQuijote.txt") ){
            int caracter ;
            while ((caracter = fr.read())!=-1)
                System.out.printf("%c",caracter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
