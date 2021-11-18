package Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    private static Connection conn;
    final private static String URL="jdbc:mysql://192.168.64.2/poe_crm";
    final private static String USERNAME="root";
    final private static String PASSWORD="";
    private DatabaseConnection(){}
    // Création d'une méthode de type Connection------ THROWS SLEXCEPTION = impose que notre fonction passe dans un block try catch
    public static Connection getInstance() throws SQLException{
        if(conn==null){
            conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }
        return conn;
    }

}
