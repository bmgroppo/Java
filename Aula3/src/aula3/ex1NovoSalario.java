
import java.util.Scanner;

public class ex1NovoSalario {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o Salário Base: ");
        double salarioBase = entrada.nextDouble();
        
        System.out.print("Informe percentual de aumento: ");
        int pAumento = entrada.nextInt();
        
        double aumento = salarioBase*pAumento/100;
        double novoSalario=salarioBase+aumento;
        
        System.out.println("Seu novo salário será: "+novoSalario);
        
    }
}