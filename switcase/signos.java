package atividade1108;

import java.util.Scanner;
	public class signos {
		public static void main (String args []) {
		
			Scanner in = new Scanner(System.in);
			int mes, dia;
			
			System.out.println("Informe o Dia de nascimento");
			dia = in.nextInt();
			
			System.out.println("Informe o Mês de nascimento");
			mes = in.nextInt();
			
			switch (mes) {
			//Janeiro
			case 1:
				if (dia <=20){
					System.out.println("Seu signo é Capricornio");
					
				}else {	
				System.out.println("Seu signo é Aquario");
				}
				break;
			//Fevereiro	
			case 2:
				if (dia <=19){
					System.out.println("Seu signo é Aquario");
					
				}else {	
				System.out.println("Seu signo é Peixes");
				}
				break;
			//MarÃ§o	
			case 3:
				if (dia <=20){
					System.out.println("Seu signo é Peixes");
					
				}else {	
				System.out.println("Seu signo é Aries");
				}
				break;
			//Abril
			case 4:
				if (dia <=20){
					System.out.println("Seu signo é Aries");
					
				}else {	
				System.out.println("Seu signo é Touro");
				}
				break;
			//Maio
			case 5:
				if (dia <=20){
					System.out.println("Seu signo é Touro");
					
				}else {	
				System.out.println("Seu signo é Gemeos");
				}
				break;
			//Junho
			case 6:
				if (dia <=20){
					System.out.println("Seu signo é Gemeos");
					
				}else {	
				System.out.println("Seu signo é Câncer");
				}
				break;
			//Julho
			case 7:
				if (dia <=22){
					System.out.println("Seu signo é Câncer");
					
				}else {	
				System.out.println("Seu signo é Leão");
				}
				break;
			//Agosto
			case 8:
				if (dia <=22){
					System.out.println("Seu signo é Leão");
					
				}else {	
				System.out.println("Seu signo é Virgem");
				}
				break;
			//Setembro
			case 9:
				if (dia <=22){
					System.out.println("Seu signo é Virgem");
					
				}else {	
				System.out.println("Seu signo é Libra");
				}
				break;
			//Outubro
			case 10:
				if (dia <=22){
					System.out.println("Seu signo é Libra");
					
				}else {	
				System.out.println("Seu signo é Escorpião");
				}
				break;
			//Novembro	
			case 11:
				if (dia <=21){
					System.out.println("Seu signo é Escorpião");
					
				}else {	
				System.out.println("Seu signo é Sargitário");
				}
				break;
			//Dezembro
			case 12:
				if (dia <=21){
					System.out.println("Seu signo é Sargitário");
					
				}else {	
				System.out.println("Seu signo é Capicornio");
				}
				break;
			}
		}
}