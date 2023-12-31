package manejoFicheros;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01Path {
    public static void main(String[] args) {
        //Construye una ruta, no tiene que existir ese fichero o carpeta
        Path path  = Paths.get(System.getProperty("user.home"),
                 "Escritorio","java", "temario.txt");
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
    }
}
