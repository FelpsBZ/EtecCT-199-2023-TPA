package atividade1108;
	import java.util.Scanner;
		public class itens {

		public static void main (String args []) {
			
			Scanner in = new Scanner(System.in);
			int item;
			
			System.out.println("Digite o codigo do item");
			item = in.nextInt();
			
			switch (item) {
			
			case 1:
				System.out.println("Item: Cachorro Quente / Preço: 8,00 ");
				break;
			case 2:
				System.out.println("Item: Cheeseburger / Preço: R$ 12,00 ");
				break;
			case 3:
				System.out.println("Item: X-Salada / Preço: R$ 15,00 ");
				break;
			case 4:
				System.out.println("Item: Misto Quente / Preço: R$ 11,00 ");
				break;
			case 5:
				System.out.println("Item: Pão na chapa / Preço: R$ 6,00 ");
				break;
			case 6:
				System.out.println("Item: Pão de Queijo / Preço: 5,00 ");
				break;
			case 7:
				System.out.println("Item: X-Bacon / Preço:13,00 ");
				break;
				
			default:
				System.out.println("Não temos itens com esse codigo");
			}
			
		}
}
