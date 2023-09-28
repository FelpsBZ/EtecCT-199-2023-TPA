package gabriel;
import java.time.LocalDate;
import java.util.Scanner;
public class UsersAge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maisVelho = 0, maisNovo = 900000000, AnoAtual, idade;
		
		AnoAtual = LocalDate.now().getYear();
		
		for(int i = 0; i <= 3; i++) {
			
			System.out.println("Digite o seu ano de nascimento");
			idade = in.nextInt();
			
			idade = AnoAtual - idade;
			
			System.out.println("você tem "+idade+" anos");
			
			if(idade > maisVelho) {
				maisVelho = idade;
			}
			if(idade < maisNovo) {
				maisNovo = idade;
			}
		}
		
		System.out.println("o mais novo tem "+ maisNovo +"anos e o mais velho tem "+ maisVelho +" anos");
}
}
