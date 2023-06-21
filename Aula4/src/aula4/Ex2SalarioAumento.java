package aula4;
import javax.swing.JOptionPane;

public class Ex2SalarioAumento {
  public static void main(String[]args){
      
    double salarioBase=Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário base: "));
    double PAumento=Double.parseDouble(JOptionPane.showInputDialog("Informe seu percentual de aumento: "));
    
    double aumento = salarioBase*PAumento/100;
    double novoSalario = salarioBase+aumento;
    
    JOptionPane.showMessageDialog(null, "Seu novo salário é: "+novoSalario);
    }
}