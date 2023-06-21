package Exercicio1;

import javax.swing.*;

public class TestaPeixe {

    public static void main(String[] args) {

        String np1 = JOptionPane.showInputDialog("Digite o Nome Popular do Primeiro Peixe:");
        String nc1 = JOptionPane.showInputDialog("Digite o Nome Científico do Primeiro Peixe:");
        String f1 = JOptionPane.showInputDialog("Digite a Família do Primeiro Peixe: ");
        String o1 = JOptionPane.showInputDialog("Digite a Origem do Primeiro Peixe: ");
        int c1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do Primeiro Peixe: "));

        Peixe p1 = new Peixe(np1, nc1, f1, o1, c1);
        
        String np2 = JOptionPane.showInputDialog("Digite o Nome Popular do Segundo Peixe:");
        String nc2 = JOptionPane.showInputDialog("Digite o Nome Científico do Segundo Peixe:");
        String f2 = JOptionPane.showInputDialog("Digite a Família do Segundo Peixe: ");
        String o2 = JOptionPane.showInputDialog("Digite a Origem do Segundo Peixe: ");
        int c2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do Segundo Peixe: "));
        
        Peixe p2 = new Peixe(np2, nc2, f2, o2, c2);

        JOptionPane.showMessageDialog(null, "Dados do Primeiro Peixe: \n\n\n"
                + "Nome Popular: " + p1.nomePopular + "\n"
                + "Nome Científico: " + p1.nomeCientifico + "\n"
                + "Família: " + p1.familia + "\n"
                + "Origem: " + p1.origem + "\n"
                + "Comprimento: "+ p1.comprimento);
        
        JOptionPane.showMessageDialog(null, "Dados do Segundo Peixe: \n\n\n"
                + "Nome Popular: " + p2.nomePopular + "\n"
                + "Nome Científico: " + p2.nomeCientifico + "\n"
                + "Família: " + p2.familia + "\n"
                + "Origem: " + p2.origem + "\n"
                + "Comprimento: "+ p2.comprimento);
    }

}
