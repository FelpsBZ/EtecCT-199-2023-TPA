package placa_carro;
import java.util.Scanner;
public class placa {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int placa;
		System.out.println("Digite o ultimo digito da placa");
		placa = in.nextInt();
		switch (placa) {
		case 1:
		case 2:
			System.out.println("Você não pode circular segunda");
			break;
		case 3:
		case 4:
			System.out.println("Você não pode circular terça");
			break;
		
		case 5:
		case 6:
			System.out.println("Você não pode circular quarta");
			break;
		case 7:
		case 8:
			System.out.println("Você não pode circular quinta");
			break;
		case 9:
		case 0:
			System.out.println("Você não pode circular sexta");
			break;
		default:
			System.out.println("Respota invalida");
		}
			
	}
}
