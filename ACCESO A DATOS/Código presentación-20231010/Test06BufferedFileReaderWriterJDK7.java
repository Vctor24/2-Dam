package com.cfgs.dam.io.ejemplos;

import java.io.*;
//  Write  a  text message to an output file, then  read  it back.
// FileReader/FileWriter uses  the default charset for file encoding.
public class Test06BufferedFileReaderWriterJDK7 {
    public static void main(String[] args) {
        String strFilename = "ficheros/out.txt";
        String message = "Hello, world!\nHello, world  again!\n";
        // Print the default charset
        System.out.println(java.nio.charset.Charset.defaultCharset());
        try (BufferedWriter out = new BufferedWriter(new FileWriter(strFilename))) {
            out.write(message);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (BufferedReader in = new BufferedReader(new FileReader(strFilename))) {
            String inLine;
            while  ((inLine = in.readLine()) != null) {  // exclude newline
                System.out.println(inLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
