package R2M;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class UsersDao extends DBConnection {

    Connection cx;

    public UsersDao() throws SQLException, ClassNotFoundException {
        this.cx = getMyDBConnection();
    }

    public UsersDao(Connection cx) {
        this.cx = cx;
    }

    public User getUser(String nome) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cx.prepareStatement("select * from users where login = ?");
            pst.setString(1, nome);
            rs = pst.executeQuery();
            if (rs.next()) {
                User usr = getUserFromSQL(rs);
                return usr;
            }
        } finally {
            pst.close();
            rs.close();
        }
        return null;
    }

    public boolean isValidUserAndPassword(String username, String password) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cx.prepareStatement("select * from users where login = ? and password =  ?");
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } finally {
            pst.close();
            rs.close();
        }
        return false;
    }

    private User getUserFromSQL(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
    }
    


