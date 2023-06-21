package ListaAv1;

public class Cliente {

    String codigo;
    String nome;
    String dataNascimento;
    String profissao;
    Endereco endereco = new Endereco();

    public void cadastrar(String codigo, String nome, String dataNascimento, String profissao, String tipoLogradouro, String logradouro, String numero, String complemento, String bairro, String cidade, String estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
        endereco.cadastrar(tipoLogradouro, logradouro, numero, complemento, bairro, cidade, estado);
    }
}
