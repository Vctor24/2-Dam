package com.cfgs.dam.io.ejemplos;

import java.io.*;
public class Test07FicherosBinariosApp {
    public static void main(String[] args) {
        try(FileInputStream fis=
            new FileInputStream("ficheros/numeros.dat")){
            int valor=fis.read();
            while(fis.available()>0){
                System.out.printf("%d\n",valor);
                valor=fis.read();
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Fin");
    }
}