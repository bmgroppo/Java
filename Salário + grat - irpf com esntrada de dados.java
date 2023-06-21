import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o Salário: ");
        double salario = entrada.nextDouble();
        
        System.out.print("Informe a Gratificação: ");
        int grat = entrada.nextInt();
        
        System.out.print("Informe o Imposto: ");
        int irpf = entrada.nextInt();
        
        double receber = salario +(salario*grat/100)-(salario*irpf/100);
        
        System.out.println("Seu Salário + Gratificação - Imposto é: "+receber);
    }
    
}
	