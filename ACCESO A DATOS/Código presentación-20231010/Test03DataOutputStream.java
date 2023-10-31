package manejoFicheros;

import java.io.*;

public class Test03DataOutputStream {
    public static void main(String[] args) {
        double[] precios={1350, 400, 890, 6200, 8730};
        int[] unidades={5, 7, 12, 8, 30};
        String[] descripciones={"paquetes de papel", "lápices",
                "bolígrafos", "carteras", "mesas"};
        try (DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("ficheros/pedido.dat")));) {
            for (int i = 0; i < precios.length; i++) {
                dos.writeChars(descripciones[i]);
                dos.writeChar('\r');
                dos.writeChar('\n');
                dos.writeInt(unidades[i]);
                dos.writeChar('\t');
                dos.writeDouble(precios[i]);
                dos.writeChar('\r');
                dos.writeChar('\n');
            }
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
