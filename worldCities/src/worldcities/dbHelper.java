package worldcities;
import java.sql.*;

public class dbHelper {
    private final String userName ="root";
    private final String password = "2855";
    private final String dbUrl ="jdbc:mysql://localhost:3306/world";
    
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrors(SQLException exception){
        System.out.println("Error : "+exception.getMessage());
        System.out.println("Error kodu : "+exception.getErrorCode());
    }
    
}
