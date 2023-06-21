package poo;
import java.util.Scanner;
public class Vetores2 {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner (System.in);
    String[] cores = new String[2];
        
        for (int i=0; i<2; i++){
            System.out.print("Digite uma cor: ");
            cores[i] = entrada.next();
        }
        for (int z=0; z<2; z++){
            System.out.println("A cor digitada foi: "+cores[z]);    
        }
               
    }
    
}
