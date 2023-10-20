package vetores;
import java.util.Scanner;
public class inversaoDeValores {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
		int i, a[], b[];
	
		final int TAM = 10;

        a = new int [TAM];
        b = new int [TAM];

        System.out.println("Digite 10 números inteiros para o vetor A:");

        for (i = 0; i < TAM; i++) {
           a[i] = in.nextInt(); 
        }

        for (i = 0; i < TAM; i++) {
            b[i] = a[9 - i];
        }

        System.out.println("Vetor B (invertido):");
        System.out.print("[ ");
        for (i = 0; i < TAM; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("]");
    }
}

