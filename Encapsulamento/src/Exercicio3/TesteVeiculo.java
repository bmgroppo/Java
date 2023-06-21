package Exercicio3;

import javax.swing.JOptionPane;

public class TesteVeiculo {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        v1.nome = (JOptionPane.showInputDialog("Informe o nome do veículo: "));

        for (int i = 1; i <= 5; i++) {

            v1.setVelocidade(Float.parseFloat(JOptionPane.showInputDialog("Informe a " + i + "ª velocidade: ")));
            
        }

        JOptionPane.showMessageDialog(null, "O carro é " + v1.nome + " e a velocidade é " + v1.getVelocidade());

    }

}
