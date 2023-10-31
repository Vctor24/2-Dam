package manejoFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01Scanner {
    public static void main(String[] args) {
        // Construye un Scanner para parsear un int desde teclado
        Scanner in1 = new Scanner(System.in);
        System.out.printf("%.2f\n",in1.nextDouble());
        //  Construye  un Scanner  para  parsear los dobles de un fichero
        try (Scanner in2 = new Scanner(new File("ficheros/numeros.dat"))){
            while (in2.hasNextInt()) {
                System.out.printf("%d\t",in2.nextInt());
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //  Construye  un Scanner  para  parsear string
        try (Scanner in3 = new Scanner("This is the input text String")) {
            while (in3.hasNext()) {
                String s = in3.next();
            }
        }
    }
}
