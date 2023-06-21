package Exercicio3;

public class Veiculo {

    String nome;
    private float velocidade;

    public void acelera() {
        if (this.velocidade <= 10) {
            this.velocidade++;
        }
    }

    public void frea() {
        if (this.velocidade > 0) {
            this.velocidade--;
        }
    }

    public void mostraVelocidade() {

        System.out.println(velocidade);

    }

    public float getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
}
