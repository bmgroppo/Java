

import java.sql.*;

public abstract class DBConnection {
    
    final private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost:3306/usuarios";
    final private String user = "root";
    final private String password = "b8s7r980";
    
    public Connection getConnection() 
            throws ClassNotFoundException, SQLException{
        
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
        
    }
    
}
