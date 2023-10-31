package manejoFicheros;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test06PrintWriter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter pw = new PrintWriter("ficheros/usoPrintWriter.txt") ){
            System.out.println("Introduce texto (fin - salir):");
            String cadena = scanner.nextLine();
            while (!cadena.toUpperCase().equals("FIN")){
                pw.println(cadena); // se graba en fichero
                cadena = scanner.nextLine(); //se solicita otra
            }
            pw.flush(); // se vuelca a disco
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
