
import java.sql.SQLException;
import java.util.Scanner;

public class AppJDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int aux;
        int wh = 1;
        int id;


        while (wh == 1) {
            Scanner i = new Scanner(System.in);
            System.out.println("escolha entre as 5 op��es:");
            System.out.println("1 - CRIAR USU�RIO");
            System.out.println("2 - BUSCAR USU�RIO");
            System.out.println("3 - EDITAR USU�RIO");
            System.out.println("4 - DELETAR USU�RIO");
            System.out.println("5 - MOSTRAR TODOS OS USU�RIOS");
            aux = i.nextInt();
            //Usuarios user = new Usuarios();
            Usuarios user = new Usuarios();
            switch (aux) {
                case 1:
//                    try{
                    i.nextLine();
                    System.out.println("Digite o login:");
                    String login = i.nextLine();
                    user.setLogin(login);
                    System.out.println("Digite a senha:");
                    String senha = i.nextLine();
                    user.setPassword(senha);
                    System.out.println("Digite o endere�o:");
                    String endereco = i.nextLine();
                    user.setEndereco(endereco);
                    user.incluirUsuarios();
//                    }catch(){
//                    
//                    }
                    break;
                case 2:
                    System.out.println("Digite o ID do usu�rio:");
                    id = i.nextInt();
                    user = new Usuarios().getUsuarios(id);
//                  user.getUsuarios(7);
                    if (user != null) {
                        System.out.println(user.getId());
                        System.out.println("Login: "+user.getLogin());
                        System.out.println("Senha: "+user.getPassword());
                        System.out.println("Endere�o: "+user.getEndereco());
                    } else {
                        System.out.println("Usu�rio n�o encontrado!");
                    }
                    break;
                case 3:
                    i.nextLine();
                    System.out.println("Digite o ID do usu�rio que deseja alterar:");
                    id = i.nextInt();
                    user.setId(id);
                    i.nextLine();
                    //int id = i.nextInt();
                    System.out.println("Digite o login:");
                    login = i.nextLine();
                    user.setLogin(login);
                    System.out.println("Digite a senha:");
                    senha = i.nextLine();
                    user.setPassword(senha);
                    System.out.println("Digite o endere�o:");
                    endereco = i.nextLine();
                    user.setEndereco(endereco);
                    user.alterarUsuarios();                    
                    break;
                case 4:
                    System.out.println("Digite o ID do usu�rio:");
                    id = i.nextInt();
                    user.setId(id);
                    user.excluirUsuarios();
                    break;
                case 5:
                    user.consultarUsuarios();
                    break;
                default:
                    break;
            }
            
            System.out.println("Deseja realizar outra opera��o?");
            System.out.println("Digite 1 para continuar ou outra tecla para sair");
            wh = i.nextInt();
        }

    }
}
