package bateriaaleatorios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Chaves_Victor_T1b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Se ha iniciado el programa");
            //Encontramos el fichero
            String[] fichero = {"Java", "/Users/DAM/NetBeansProjects/BateriaAleatorios/src/bateriaaleatorios/GeneradorAleatorios.java"};
            ProcessBuilder proceso = new ProcessBuilder(fichero); //Iniciamos el Proceso para leer
            System.out.print("Cantidad de intentos: ");
            int intentos = teclado.nextInt();
            Process[] pro = new Process[intentos];
            String[]salida = new String[intentos];
            
            
            for (int i = 0; i < pro.length; i++) {

                pro[i] = proceso.start(); //Iniciamos el proceso.
            }
            for (int i = 0; i < pro.length; i++) {
                
                
                InputStream si = pro[i].getInputStream(); //Proceso necesario para el BufferedReader
                InputStreamReader sire = new InputStreamReader(si);//Proceso necesario para el BufferedReader
                BufferedReader bf = new BufferedReader(sire);
                pro[i].waitFor();
                salida[i]= bf.readLine(); //Leemos linea
               
            }
            for (String string : salida) {
                System.out.println(string);
            }
            
        } catch (IOException | InterruptedException e) {
            e.getMessage();
        } 

    }
}