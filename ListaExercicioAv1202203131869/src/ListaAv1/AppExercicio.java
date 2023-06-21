package ListaAv1;

public class AppExercicio {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.cadastrar(0, "Bruno", "24/07/1980", "Químico", 1200, "10/03/2010", "Rua", "Fenícia", "419", "Casa", "Vilar dos Teles", "São João de Meriti", "RJ");

        System.out.println("O funcionario " + f1.nome + " foi cadastrado");

        Cliente c1 = new Cliente();

        c1.cadastrar("1", "Raphael", "07/12/1999", "Estudante", "Rua", "Marcílio Dias", "270", "fundos", "Jd Caiçara", "Cabo Frio", "RJ");

        System.out.println("O cliente " + c1.nome + " foi cadastrado");
        
        
    }
}
