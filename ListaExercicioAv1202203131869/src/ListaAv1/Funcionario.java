package ListaAv1;

public class Funcionario {

    int matricula;
    String nome;
    String dataNascimento;
    String cargo;
    float salario;
    String dataAdmissao;
    Endereco endereco = new Endereco();

    public void cadastrar(int matricula, String nome, String dataNascimento, String cargo, float salario, String dataAdmissao, String tipoLogradouro, String logradouro, String numero, String complemento, String bairro, String cidade, String estado) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        endereco.cadastrar(tipoLogradouro, logradouro, numero, complemento, bairro, cidade, estado);

        System.out.println("Novo funcionario cadastrado");
    }

    public void reajustarSalario(float percentual) {
        this.salario = salario - (salario * (percentual / 100));
    }

    public void promover(String novoCargo) {
        this.cargo = novoCargo;
    }
}
