


public class GeneradorAleatorios {

    public static void main( String[ ] args) {
      
      int numero;
      boolean esPrimo;
      
      numero = (int) Math.floor( Math.random() * 100000 + 100000 );
      esPrimo = true;
      for (int i=2; i<=numero/2; i++) {
         if (numero%i==0) {
            esPrimo=false;
                }
          }

       if (esPrimo) {
           System.out.println(numero);
           System.exit(0);  
       } else {
          System.out.println("No generó un número primo");
           System.exit(1);  
       }        
    }
}

