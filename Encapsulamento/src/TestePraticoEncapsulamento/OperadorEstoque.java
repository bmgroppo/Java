package TestePraticoEncapsulamento;

import javax.swing.JOptionPane;

public class OperadorEstoque {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        
        p1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do Produto: ")));
        p1.setDescricao(JOptionPane.showInputDialog("Informe a descrição do Produto: "));
        
        String entrada = (JOptionPane.showInputDialog("Que operação deseja realizar? E=Entrada S= Saída"));
        
        if (entrada.equals("E")){
            p1.registrarEntrada(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de entrada: ")));
        }
        else {
            p1.registrarSaida(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de saída: ")));
            
        
            
        }
    }

}
