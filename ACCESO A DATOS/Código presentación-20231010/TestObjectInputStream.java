package manejoFicheros;

import java.io.*;
import java.util.Date;
public class TestObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream out  =  new ObjectOutputStream(new BufferedOutputStream(
                        new FileOutputStream("object.ser")));
        out.writeObject("The current Date and Time is");
        out.writeObject(new Date());
        out.flush();
        out.close();
        ObjectInputStream in  =  new ObjectInputStream(new BufferedInputStream(
                        new FileInputStream("object.ser")));
        String str = (String) in.readObject();
        Date d = (Date) in.readObject();
        in.close();
    }
}
