import java.io.*;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        binario();
       // Texto();
    }
    public static void binario(){


        try (DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("ficheros/numeros.dat")));) {
            for (int i = 0; i < 20; i++) {
                dos.writeChars(new Random().nextInt(41 - 20) + 20 +"");

            }
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Texto(){

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("ficheros/numeros.txt"));){
            for (int i = 0; i < 20; i++) {
                bw.write(new Random().nextInt(41 - 20) + 20 +"");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
