import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio3 {
    public static final String COM_MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static void main(String[] args) {
        try{
            Class.forName(COM_MYSQL_JDBC_DRIVER);
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        String createString = "UPDATE CLIENTES SET APELLIDOS = 'SANCHEZ' WHERE DNI='78354443F';";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/demo", "admin","victor24."); Statement stmt = con.createStatement()){
            stmt.execute(createString);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}