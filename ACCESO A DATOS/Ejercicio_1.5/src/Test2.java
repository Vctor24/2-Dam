import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String fileName = "ficheros/mapas.csv";
        Mapa mapa = new  Mapa();
        leerCSV(fileName, mapa);
        System.out.println(mapa);
        escribirPosicion(mapa);

    }

    public static void leerCSV(String fileName, Mapa mapa){

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName), "UTF-8"))) {
            String line;
            // Leer y mostrar el contenido del archivo línea por línea
            while ((line = br.readLine()) != null) {
                if (!line.startsWith("id")){
                    //System.out.println(line);
                    String[] campos = line.split(",");
                    if (campos.length == 7){
                        mapa.getMapa().put(campos[0], new Localidad(campos[1],campos[2], campos[3], campos[4], campos[5], campos[6] ));


                    }

                }

            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

    }
    public static void escribirPosicion(Mapa mapa){
        String localidad;

        do {
            System.out.println("Para terminar escriba \"salir\".");
            System.out.print("Dime una localidad: ");
            localidad = teclado.next();
            if (!localidad.equalsIgnoreCase("salir")){
                String[] posicion = mapa.recorreMapa(localidad);
                System.out.println("Las coordenadas de "+ localidad+ " son: \nLatitud: "+posicion[0]+", Longitud: "+posicion[1]);
                System.out.println("...............");

            }


        }while (!localidad.equalsIgnoreCase("salir"));
    }
}
