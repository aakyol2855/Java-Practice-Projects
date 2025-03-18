package jdbcıntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private final String username = "root";
    private final String password = "2855";
    private final String dbUrl = "jdbc:mysql://localhost:3306/world";
    
    public Connection getConn() throws SQLException {
        // Java'nın sql.Connection sınıfını kullanıyoruz
        return DriverManager.getConnection(dbUrl, username, password);
    }
    
    public void showErrors(SQLException except) {
        System.out.println("Error: " + except.getMessage());
        System.out.println("Error code: " + except.getErrorCode());
    }
}
