package aula3;

import java.util.Scanner;
        
public class ex4PrecoCarro {
    public static void main(String[]args){
    Scanner entrada=new Scanner (System.in);
    
 System.out.print("Informe o preço de fábrica do Carro:");
 double PFabrica = entrada.nextDouble();
 
 System.out.print("Informe Percentual de lucro do Distribuidor: ");
 double PLucro = entrada.nextDouble();
 
 System.out.print("Informe Percentual de Imposto sobre o Preço de Fábrica: ");
 double PImposto=entrada.nextDouble();

double Lucro = PFabrica*PLucro/100;
double Imposto = PFabrica*PImposto/100;
double PFinal = PFabrica+Lucro+Imposto;
                
  System.out.println("O lucro do distribuidor é: "+Lucro);
  System.out.println("O valor dos Impostos é: "+Imposto);
  System.out.println("O Preço Final do Carro é: "+PFinal);
}
}