import java.util.Scanner;
public class NumFatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num,sub,mult;
		
		System.out.println("Diga um número");
		num = in.nextInt();
		
		sub = num;
		mult = num;
		
		while(sub > 1) {
			sub --;
			mult = mult*sub;
		}
		System.out.println("O fatorial de "+num+" é "+mult);
	}
}
