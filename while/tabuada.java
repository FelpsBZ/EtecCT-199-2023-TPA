import java.util.Scanner;
	public class tabuada {
		public static void main (String args []) {
		
		Scanner in = new Scanner(System.in);
		int i=1, tab, r;
		
		
		System.out.println("Qual tabuada você quer? ");
		tab = in.nextInt();
			
		while (i <=10) {
			r = tab*i;
			System.out.println(+tab+" x "+i+" = "+r);
			i++;
		}
			
		}
}
