
package Grupo;

import java.sql.*;

public class AppJDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Usuarios user = new Usuarios();
        user.setLogin("bmg");
        user.setSenha("123");
        
        if (user.consultarUsuarios()) {
            System.out.println("Usuário encontrado com sucesso!");
        }
    }
    
}
