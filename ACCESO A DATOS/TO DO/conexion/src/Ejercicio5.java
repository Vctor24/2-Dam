import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio5 {
    public static final String COM_MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static void main(String[] args) {
        try{
            Class.forName(COM_MYSQL_JDBC_DRIVER);
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        String createString = "SELECT * FROM CLIENTES;";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/demo", "admin","victor24."); Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)){

            ResultSet rs = stmt.executeQuery(createString);

            System.out.println("DNI\tAPELLIDOS\tCP");


            rs.afterLast();
            while(rs.previous()){
                System.out.printf("%s\t%s\t%s\n", rs.getString(1), rs.getString(2), rs.getString(3));
            }
            rs.last();
            System.out.println("Total de registros: "+rs.getRow());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}