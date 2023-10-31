package manejoFicheros;

import java.io.*;
public class FicherosBinariosApp {
    public static void main(String[] args) {
        try(FileInputStream fis=
            new FileInputStream("D:\\fichero_bin.ddr")){
            int valor=fis.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fis.read();
            }
        }catch(IOException e){
            //.......
        }
    }
}