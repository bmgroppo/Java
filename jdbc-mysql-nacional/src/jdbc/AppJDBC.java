package jdbc;

import java.sql.*;
import javax.swing.JOptionPane;
//App de Consulta ao Banco de dados. Falta criar um JOPtionPane
public class AppJDBC {

    public static void main(String[] args) throws 
           ClassNotFoundException, SQLException{
        
        String login1 = JOptionPane.showInputDialog("Digite um login para procurar:");
        String senha1 = JOptionPane.showInputDialog("Digite a senha do login informado para procurar:");
        
        Usuarios user = new Usuarios(login1, senha1);
        user.setLogin(login1);
        user.setSenha(senha1);
        
        if (user.consultarUsuarios()) {
            System.out.println("Usuário encontrado com sucesso!");
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }
    
}
