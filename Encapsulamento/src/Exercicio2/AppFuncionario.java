package Exercicio2;

public class AppFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setMatricula(123);
        f1.setNome("José");
        f1.setSalario(1200);
        
        System.out.println(f1.getMat());
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());

    }

}
