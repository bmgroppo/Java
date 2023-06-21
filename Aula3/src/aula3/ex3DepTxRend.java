
import java.util.Scanner;

public class ex3DepTxRend {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o Depósito: ");
        double deposito = entrada.nextDouble();
        
        System.out.print("Informe a taxa de juros: ");
        int taxa = entrada.nextInt();
        
        double rend = deposito*taxa/100;
        double total=deposito+rend;
        
        System.out.println("Seu rendimento foi de: "+rend);
        System.out.println("Seu saldo atualizado é de: "+total);
    }
}
