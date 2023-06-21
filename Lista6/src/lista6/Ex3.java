
package lista6;
import java.lang.Math;

public class Ex3 {
    public static void main(String[] args) {

        int i;
        int [] dados1={1, 4, 9, 16, 25, 36};
        double [] dados2=new double[6];
        
        for (i=0;i<dados2.length;i++){
            dados2[i] = Math.sqrt(dados1[i]);
            System.out.println("A raiz quadrada de "+dados1[i]+" eh "+dados2[i]);
                    
        }
        
    }
    
}
