import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        String fileName = "geografia.csv";
        Mapa mapa = new  Mapa();
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
                    creaFichero(line);

                }

            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println(mapa);
    }

    public static void creaFichero(String mapa){
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("ficheros/mapas.csv", true));){

                bw.write(mapa);
                bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
