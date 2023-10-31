package com.cfgs.dam.io.ejemplos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test10SerializableReadPersonas {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Object p;
        try (ObjectInputStream entrada = new ObjectInputStream(
                new FileInputStream("ficheros/personas.dat"));) {
            p = lectura(entrada);
            while (p != null) {
                if (p instanceof Persona)
                    lista.add((Persona) p);
                p = lectura(entrada);
            }
        } catch (IOException e) {
            System.err.println("1 " + e.getMessage());
        }
        System.out.println(lista);
    }

    public static Object lectura(ObjectInputStream entrada) {
        try {
            return entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return  null;
        }
    }
}