package R2M;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.derby.client.am.SqlException;

public abstract class DBConnection {
    final private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost:3306/db_dsi";
    final private String user = "root";
    final private String password = "root";
    
    public Connection getMyDBConnection() throws 
            ClassNotFoundException, SQLException{
        
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }

    private static class DriverManager {

        private static Connection getConnection(String url, String user, String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }
}
    
    

