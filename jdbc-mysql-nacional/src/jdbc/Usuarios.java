package jdbc;
import java.sql.*;

public class Usuarios extends Conexao{
    
    private int id;
    private String login;
    private String senha;
    private String endereco;

    Connection cx;
    
    public Usuarios() throws 
           ClassNotFoundException, SQLException{
        this.cx = getConexao();
    }
    
    public Usuarios(Connection cx) throws 
           ClassNotFoundException, SQLException{
        this.cx = cx;
    }
   
    public boolean consultarUsuarios() throws SQLException{
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            pst = this.cx.prepareStatement("SELECT * FROM usuarios where login=? and senha=?");
            pst.setString(1, this.login);
            pst.setString(2, this.senha);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
            
        }finally{
            pst.close();
            rs.close();
        }
        return false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
