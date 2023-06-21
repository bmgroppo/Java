package Exercicio1;

public class Peixe {
    String nomePopular;
    String nomeCientifico;
    String familia;
    String origem;
    int comprimento;
    
    Peixe(){
        this.nomePopular = "";
        this.nomeCientifico = "";
        this.familia = "";
        this.origem = "";
        this.comprimento = 0;
    }
    
    Peixe(String nomePopular, String nomeCientifico, String familia, String origem, int comprimento){
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.familia = familia;
        this.origem = origem;
        this.comprimento = comprimento;
    }
    
}

