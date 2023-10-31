package manejoFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestCreacionFicheros {
    public static void main(String[] args) throws IOException {
        try {
            //create a temp file
            File temp = File.createTempFile("temp-file-name", ".tmp");
            System.out.println("Temp file : " + temp.getAbsolutePath());
        } catch(IOException e){
            e.printStackTrace();
        }
        File file = new File("c://temp//testFile1.txt");
        //Create the file
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }
        //Write Content
        FileWriter writer = new FileWriter(file);
        writer.write("Test  data");
        writer.close();
    }
}
