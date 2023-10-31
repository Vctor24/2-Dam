package manejoFicheros;

import java.io.*;

public class TestLecturaCodificado {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream("prueba2.txt"), "iso-8859-1"))) {
            String linea;
            while ((linea = in.readLine()) != null)
                System.out.println(linea);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter out = new BufferedWriter(  new OutputStreamWriter(
                new FileOutputStream("prueba3.txt"), "iso-8859-1"));

    }
}
