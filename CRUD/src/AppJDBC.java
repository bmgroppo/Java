
import java.sql.SQLException;
import java.util.Scanner;

public class AppJDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int aux;
        int wh = 1;
        int id;


        while (wh == 1) {
            Scanner i = new Scanner(System.in);
            System.out.println("escolha entre as 5 opções:");
            System.out.println("1 - CRIAR USUÁRIO");
            System.out.println("2 - BUSCAR USUÁRIO");
            System.out.println("3 - EDITAR USUÁRIO");
            System.out.println("4 - DELETAR USUÁRIO");
            System.out.println("5 - MOSTRAR TODOS OS USUÁRIOS");
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
                    System.out.println("Digite o endereço:");
                    String endereco = i.nextLine();
                    user.setEndereco(endereco);
                    user.incluirUsuarios();
//                    }catch(){
//                    
//                    }
                    break;
                case 2:
                    System.out.println("Digite o ID do usuário:");
                    id = i.nextInt();
                    user = new Usuarios().getUsuarios(id);
//                  user.getUsuarios(7);
                    if (user != null) {
                        System.out.println(user.getId());
                        System.out.println("Login: "+user.getLogin());
                        System.out.println("Senha: "+user.getPassword());
                        System.out.println("Endereço: "+user.getEndereco());
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
                case 3:
                    i.nextLine();
                    System.out.println("Digite o ID do usuário que deseja alterar:");
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
                    System.out.println("Digite o endereço:");
                    endereco = i.nextLine();
                    user.setEndereco(endereco);
                    user.alterarUsuarios();                    
                    break;
                case 4:
                    System.out.println("Digite o ID do usuário:");
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
            
            System.out.println("Deseja realizar outra operação?");
            System.out.println("Digite 1 para continuar ou outra tecla para sair");
            wh = i.nextInt();
        }

    }
}
