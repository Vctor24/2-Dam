package manejoFicheros;

import java.nio.file.Paths;
import java.nio.file.Path;
public class PathInfo {
    public static void main(String[] args) {
        // Windows
        Path path = Paths.get("D:\\myproject\\java\\test\\Hello.java");
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
    }
}