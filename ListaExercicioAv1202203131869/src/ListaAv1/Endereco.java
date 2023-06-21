package ListaAv1;

public class Endereco {

    String tipoLogradouro;
    String logradouro;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String estado;

    public void cadastrar(String tipoLogradouro, String logradouro, String numero, String complemento, String bairro, String cidade, String estado) {
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}
