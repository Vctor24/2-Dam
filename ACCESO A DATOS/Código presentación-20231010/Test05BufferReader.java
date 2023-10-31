package manejoFicheros;

import java.io.*;

public class Test05BufferReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("ficheros/BufferQuijote.txt"))){
            String linea;
            while ((linea = br.readLine())!= null)
                System.out.printf("%s\n",linea);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
