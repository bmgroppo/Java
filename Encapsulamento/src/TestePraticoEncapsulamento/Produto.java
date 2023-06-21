package TestePraticoEncapsulamento;

import javax.swing.JOptionPane;

public class Produto {

    private int codigo;
    private String descricao;
    private int saldo;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void registrarEntrada(int quantidade) {
        this.saldo += quantidade;
        JOptionPane.showMessageDialog(null,"Produto: "+this.descricao+"; código: "+this.codigo+"; agora posui "+this.saldo+" unidades!");

    }

    public void registrarSaida(int quantidade) {
        this.saldo -= quantidade;
        JOptionPane.showMessageDialog(null,"Produto: "+this.descricao+"; código: "+this.codigo+"; agora posui "+this.saldo+" unidades!");
    }

}
