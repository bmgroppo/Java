
package Grupo;
import java.sql.*;

public abstract class Conexao {
    final private String driver="com.mysql.cj.jdbc.Driver";
    final private String url="jdbc:mysql://localhost:3306/estacio";
    final private String usuario="root";
    final private String senha="b8s7r980";
    
    public Connection getConexao() throws 
        ClassNotFoundException, SQLException {
        
        Class.forName(driver);
        return DriverManager.getConnection(url, usuario, senha);
    }
}