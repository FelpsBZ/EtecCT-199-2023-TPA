import java.util.Scanner;
public class media {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int i, a[], soma = 0;
	double media;
	
	final int TAM = 10;
	
	a = new int [TAM];
	
	for (i = 0; i<TAM; i++) {
		
		System.out.println("Informe o "+(i+1)+"o. valor de A.");
		a[i] = in.nextInt();		
	}
	
	for (i = 0; i<TAM; i++) {
		
		soma += a[i];
	}
	
	media = (double) soma / TAM;
	
	System.out.println("A Media é: "+media);
	
	
}
}
