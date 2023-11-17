import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        final int TAM = 10;
        
        int a[], b[], i;
        
        a = new int[TAM];
        b = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.print("Digite o "+(i+1)+"o valor do vetor A: ");
            a[i] = in.nextInt();
            
        }

        for(i=0; i<TAM; i++) {
            b[i] = a[i];
        }

        Arrays.sort(b);

        System.out.print("B = [ ");
        
        for(i=0; i<TAM; i++) {
            System.out.print(b[i]+" ");
            
        }
        
        System.out.print("]");
    }
}
