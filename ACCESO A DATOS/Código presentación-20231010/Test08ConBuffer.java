package com.cfgs.dam.io.ejemplos;

import java.io.*;
public class Test08ConBuffer {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream bis =new BufferedInputStream(
                new FileInputStream("ficheros/introquijote.txt"));){
            // read until a single byte is available
            while(bis.available()>0) {
                // read the byte and convert the integer to character
                char c = (char)bis.read();
                // print the characters
                System.out.println("Char: "+c);;
            }
        } catch(Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
