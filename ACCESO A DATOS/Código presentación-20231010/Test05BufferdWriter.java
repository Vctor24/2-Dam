package manejoFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Test05BufferdWriter {
    public static void main(String[] args) {
        List<String> quijote = Arrays.asList(new String[]
                {"En un lugar de la Mancha,", "de cuyo nombre no quiero acordarme,",
                "no ha mucho tiempo que vivía un hidalgo",
                "de los de lanza en astillero,",
                "adarga antigua, rocín flaco y galgo corredor." });
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("ficheros/BufferQuijote.txt"));){
            for (String s : quijote) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
