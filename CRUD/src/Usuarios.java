

import com.mysql.cj.exceptions.DataTruncationException;
import java.sql.*;

public class Usuarios extends DBConnection {

    private int id;
    private String login;
    private String senha;
    private String endereco;

    Connection cx;

    public Usuarios() throws ClassNotFoundException, SQLException {
        this.cx = getConnection();
    }

    public Usuarios(Connection cx) {
        this.cx = cx;
    }

    public void incluirUsuarios() throws SQLException, DataTruncation, DataTruncationException {
        PreparedStatement pst = null;
        try {
            pst = cx.prepareStatement("INSERT INTO usuarios "
                    + "(login,senha,endereco) values (?,?,?)");
            pst.setString(1, this.login);
            pst.setString(2, this.senha);
            pst.setString(3, this.endereco);
            pst.executeUpdate();
            System.out.println("Usuário Cadastrado com sucesso!");
        }
        finally {

        }
    }

    public Usuarios getUsuarios(int id) throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = cx.prepareStatement("select * from usuarios where id = ?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                Usuarios usr = getUserFromSQL(rs);
                return usr;
            }

        } finally {
            pst.close();
            rs.close();

        }
        return null;
    }

    private Usuarios getUserFromSQL(ResultSet rs) throws
            SQLException, ClassNotFoundException {

        Usuarios returned = new Usuarios();
        returned.id = rs.getInt("id");
        returned.login = rs.getString("login");
        returned.senha = rs.getString("senha");
        returned.endereco = rs.getString("endereco");
        return returned;
    }

    public void alterarUsuarios() throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = cx.prepareStatement("UPDATE usuarios SET login = ?, "
                    + "senha=?,"
                    + "endereco=?"
                    + " WHERE id = ?");

            pst.setString(1, this.login);
            pst.setString(2, this.senha);
            pst.setString(3, this.endereco);
            pst.setInt(4, this.id);
            pst.executeUpdate();

            System.out.println("Usuário Alterado com sucesso!");
        } finally {

        }

    }
    
    public void excluirUsuarios() throws SQLException{
        PreparedStatement pst = null;
        try {
            pst = cx.prepareStatement("DELETE FROM usuarios WHERE id = ?");

            pst.setInt(1, this.id);
            pst.executeUpdate();

            System.out.println("Usuário Excluído com sucesso!");
        } finally {

        }
    }

    public Usuarios consultarUsuarios() throws SQLException, ClassNotFoundException {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = cx.prepareStatement("select * from usuarios");

            rs = pst.executeQuery();
            if (rs.next()) {
                do{
                    Usuarios usr = getUserFromSQL(rs);
                    System.out.println("ID: "+usr.getId() + " Login: " + usr.getLogin());
                }while(rs.next());
            }

        } finally {
            pst.close();
            rs.close();

        }
        return null;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getPassword() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setPassword(String senha) {
        this.senha = senha;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
