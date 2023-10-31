package com.cfgs.dam.io.ejemplos;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Test15Files {
    public static void main(String[] args){
        Path path = Paths.get("ficheros/quijote.txt");
        System.out.printf("%s es un directorio: %b\n",path.toString(), Files.isDirectory(path));
        System.out.printf("%s es un archivo: %b\n",path.toString(), Files.isRegularFile(path));
        System.out.printf("%s es un enlace: %b\n",path.toString(), Files.isSymbolicLink(path));
        System.out.printf("%s permite la lectura: %b\n",path.toString(), Files.isReadable(path));
        System.out.printf("%s permite la escritura: %b\n",path.toString(), Files.isWritable(path));
        System.out.printf("%s permite la ejecución: %b\n",path.toString(), Files.isExecutable(path));
        Path path2 = Paths.get("ficheros/quijote(copia).txt");
        try {
        Path path3 = Files.copy(path,path2, StandardCopyOption.REPLACE_EXISTING);
        System.out.println(path3.toString());
        System.out.printf("%s se ha podido borrar? %b\n",path3.toString(), Files.deleteIfExists(path3));
            List<String> lineas = Files.readAllLines(path);
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

        Path pathD=Paths.get("ficheros/nuevo");
        try {
            Files.createDirectories(pathD);
            System.out.println("Directorio "+pathD.toString()+" creado");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
