package aula4;
import javax.swing.JOptionPane;

public class Ex1MostraIdade {
  public static void main(String[]args) {
      
    int idade=Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
    JOptionPane.showMessageDialog(null, "A idade foi: "+idade);
    }
    
}
