import java.util.Scanner;
public class NumFibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 1, sub = 0, ant, n;
		
		System.out.println("Diga o valor de n");
		n = in.nextInt();
		
		if(n == 0) {
			
		}
		
		while(n > 0) {
			n --;
			
			ant = num;
			num = sub + num;
			sub = ant;
			
			System.out.print(num+", ");
		}
	}
}
