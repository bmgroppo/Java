package jdbc;

import java.sql.SQLException;

public class AppJDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //Usuarios usua = new Usuarios().getUsuarios(4);
        //Usuarios user = usua.getUsuarios(4);
        Usuarios user = new Usuarios().getUsuarios(2);
        
        if (user != null) {
            System.out.println(user.getLogin());
            System.out.println(user.getPassword());
            System.out.println(user.getEndereco());
            
            //user.setEndereco("Rua Campo Grande");
            
            //user.alterarUsuarios(user);
            //user.alterarUsuarios();
            user.excluirUsuarios();
                       
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }
    
}
