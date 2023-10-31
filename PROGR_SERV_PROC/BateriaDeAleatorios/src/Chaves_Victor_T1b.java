import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Chaves_Victor_T1b {
    public static void main(String[] args) {
        try {
            //Encontramos el fichero
            String[] fichero = {"Java", "C:\\Users\\VICTORCHAVESARENAS\\IdeaProjects\\BateriaDeAleatorios\\src\\GeneradorAleatorios.java"};
            ProcessBuilder proceso = new ProcessBuilder(fichero); //Iniciamos el Proceso para leer

            for (int i = 0; i < 10; i++) {

                Process pro = proceso.start(); //Iniciamos el proceso.

                InputStream si = pro.getInputStream(); //Proceso necesario para el BufferedReader
                InputStreamReader sire = new InputStreamReader(si);//Proceso necesario para el BufferedReader
                BufferedReader bf = new BufferedReader(sire);

                String linea = bf.readLine(); //Leemos linea
                System.out.println(linea);
            }

        } catch (IOException e) {
            e.getMessage();
        }

    }
}