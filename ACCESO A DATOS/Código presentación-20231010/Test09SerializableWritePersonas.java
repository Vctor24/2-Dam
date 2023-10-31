package com.cfgs.dam.io.ejemplos;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Test09SerializableWritePersonas {
    public static void main(String[] args) {
        Persona p;
        try (ObjectOutputStream salida =new ObjectOutputStream(
                new FileOutputStream("ficheros/personas.dat"));){
            //Se crea el primer objeto Persona
            p = new Persona("12345678A","Lucas Gonzalez", 30);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el segundo objeto Persona
            p = new Persona("98765432B","Anacleto Jimenez", 28);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el tercer objeto Persona
            p = new Persona("78234212Z","Maria Zapata", 35);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            salida.flush();
        } catch (FileNotFoundException e) {
            System.err.println("1 "+e.getMessage());
        } catch (IOException e) {
            System.err.println("2 "+e.getMessage());
        }
    }
}
