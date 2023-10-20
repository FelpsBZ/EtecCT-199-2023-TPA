import java.util.Scanner;
public class quadradoDeAemB {
public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	
	int i, a[], b[];
	
	final int TAM = 10;
	
	a = new int [TAM];
	b = new int [TAM];
	
	for (i = 0; i<TAM; i++) {
		
		System.out.println("Informe o "+(i+1)+"o. de A.");
		a[i] = in.nextInt();
		
		b[i] = a[i] * a[i];
		
	}
	
	System.out.print("A [ ");
	for (i = 0; i<TAM; i++) {
		
		System.out.print(+a[i]+" ");
	}
	System.out.print("]\n");
	
	System.out.print("B [ ");
	for (i = 0; i<TAM; i++) {
		
		System.out.print(+b[i]+" ");
	}
	System.out.print("]");
}
}
