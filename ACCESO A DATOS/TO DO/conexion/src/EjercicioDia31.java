import java.sql.*;
import java.util.Scanner;

public class EjercicioDia31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("MENU: ");
        System.out.print("1. Vaciar todas las tablas\n2. Rellenar tabla categorías con valores por defecto\n"
                +"3. Cargar fichero script\n" +
                "4. Mostrar todos los libros prestados, en esa consulta se tiene que mostrar toda la información del libro (incluye la categoría del libro en modo texto), junto con  el usuario (nombre y apellidos) y la fecha de préstamo. Todo ordenado por nombre del libro\n" +
                "5. Muestra todos los libros de una determinada categoría, preguntando ésta por terminal\n" +
                "0. Salir\nElija una opción: "
       );
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1: vaciarTablas();
            break;
            case 2: valoresPorDefecto();
            break;
            case 3: cargarFichero();
            break;
            case 4: muestraLibrosPrestados();
            break;
            case 5: muestraLibros();
            break;
            case 0: break;
            default:
                System.out.println("Valor fuera de rango");
        }

    }
    public static void vaciarTablas(){
        String COM_MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        try{
            Class.forName(COM_MYSQL_JDBC_DRIVER);
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        String categoria = "DELETE FROM categoria;";
        String libro = "DELETE FROM libro;";
        String prestamos = "DELETE FROM prestamos;";
        String usuario = " DELETE FROM usuario;";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/BIBLIOTECA", "admin","victor24."); Statement stmt = con.createStatement()){
            stmt.execute(categoria);
            stmt.execute(libro);
            stmt.execute(prestamos);
            stmt.execute(usuario);
            System.out.println("Tablas vaciadas Correctamente");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void valoresPorDefecto(){}
    public static void cargarFichero(){}
    public static void muestraLibrosPrestados(){}
    public static void muestraLibros(){}

}
