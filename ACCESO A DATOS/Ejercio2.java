import java.io.*;

public class Ejercio2 {
    public static void main(String[] args) {
        leerTexto();
    }
    public static void leerBinario(){
        try (DataInputStream fip = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("ficheros/numeros.dat")));) {
             //primer byte
            while (fip.available()>0) {
                System.out.print(fip.readChar());
            }
            System.out.println("\nFichero leido con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void leerTexto(){
        try (BufferedReader br = new BufferedReader(
                new FileReader("ficheros/numeros.txt"))){
            String linea;
            int num;
            while ((linea = br.readLine())!= null)
                System.out.printf("%s\n",linea);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
