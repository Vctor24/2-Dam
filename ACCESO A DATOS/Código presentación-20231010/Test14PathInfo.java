package com.cfgs.dam.io.ejemplos;

import java.io.IOException;
import java.nio.file.*;
public class Test14PathInfo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\agarexp\\Nextcloud\\IES16.MATERIAL\\IES VIRGEN DEL CARMEN\\Modulos\\PROG-DAM\\Ejercicios2.iml\\ficheros\\introquijote.txt");
        //Path path = Paths.get("ficheros/quijote.txt");
        // Windows
        //Path path = Paths.get("D:\\myproject\\java\\test\\Hello.java");
        // Unix/Mac
        //Path  path = Paths.get("/myproject/java/test/Hello.java");
        // Print Path Info
        System.out.println("toString: " + path.toString());	// D:\myproject\java\test\Hello.java
        System.out.println("getFileName: " + path.getFileName()); // Hello.java
        System.out.println("getParent: " + path.getParent());	// D:\myproject\java\test
        System.out.println("getRoot: " + path.getRoot());	// D:\
        //  root, level-0, level-1, ...
        int nameCount = path.getNameCount();
        System.out.println("getNameCount:  " + nameCount);      // 4
        for (int i = 0; i < nameCount; ++i) {
            System.out.println("getName(" + i + "): " + path.getName(i)); //  (0)myproject, (1)java
                                                                            // (2) test, (3) Hello.java
        }
        System.out.println("subpath(0,2):  "  + path.subpath(0,2));    // myproject\java
        System.out.println("subpath(1,4):  " + path.subpath(1,4));   // java\test\Hello.java
        try {
            System.out.printf("Tamaño del fichero %d\n",Files.size(path));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}