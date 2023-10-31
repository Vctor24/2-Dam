package manejoFicheros;

public class TestStringFormat {
    public static void main(String[] args) {
        int edad = 28;
        String nombre = "David";
        String patron = "El nombre de la persona es %s y tiene %d a�os";
        String resultado = String.format(patron,nombre,edad);
        System.out.print(resultado);
        //El nombre de la persona es David y tiene 28 a�os
        int hora  = 13;  int minutos =  45;
        nombre = "David";
        patron = "%s ha accedido a las %d:%d h";
        resultado = String.format(patron,nombre,hora,minutos);
        System.out.print(resultado);
        // David ha accedido a las 13:45 h

    }
}
