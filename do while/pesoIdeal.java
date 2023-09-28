import java.util.Scanner;
public class pesoIdeal {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String sexo;
		double pesoideal, peso, altura;
		int resposta;
		
		
		do {
		System.out.println("Qual seu Sexo? F ou M");
		sexo = in.next(); 
		
		System.out.println("Qual seu Peso?");
		peso = in.nextDouble();
		
		System.out.println("Qual sua Altura");
		altura = in.nextDouble();
		
		if (sexo.equalsIgnoreCase("m")) {
			pesoideal = 52 + (0.75 * (altura - 152.4));
		}else {
			pesoideal = 52 + (0.67 * (altura - 152.4));
		}
		System.out.println("Seu peso ideal é "+pesoideal);
		
		if (peso != pesoideal){
			
			System.out.println("Você está fora do seu peso ideal.");
		}else {
			System.out.println("Você está dentro do seu peso ideal.");
		}
		
		System.out.println("Deseja contnuar? 1 para SIM ou 2 para NÂO");
		resposta = in.nextInt();
		
	}while (resposta == 1);
}
}
