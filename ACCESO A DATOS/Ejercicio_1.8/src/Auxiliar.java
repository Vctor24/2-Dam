import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class Auxiliar {
    public List<Persona> getPersonaCSV(String path){
        List<Persona> salida = new ArrayList<>();
        try(BufferedReader bff = new BufferedReader(new FileReader(path))){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return salida;
    }
}
