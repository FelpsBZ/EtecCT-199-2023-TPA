package teste;
import java.util.Scanner;

public class Amanha {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dd, da,dm, dia, mes, ano,valid = 1;
        
        System.out.println("Digite o dia de hoje");
        dia = in.nextInt(); 
        
        System.out.println("Digite o mês atual");
        mes = in.nextInt();
        
        System.out.println("Digite o ano atual");
        ano = in.nextInt();
        
        if(dia <= 0 || dia > 31 || mes <=0 || mes >12 || ano<0 || dia >30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) || dia > 29 && (mes == 2))
        {
        	System.out.println("Resposta invalida");
        	valid = 0;
        }
        
        if(dia == 31 &&  ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) {
        	dd = 1;
        	da = ano; 
        	dm = mes + 1;
        }else if(dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
        {
        	dd = 1;
        	dm = mes +1;
        	da = ano;
        }else if (dia >= 28 && mes == 2 && ano % 4 != 0)
        {
        	dd = 1;
        	dm = mes +1;
        	da = ano;
        }else if (dia == 29 && mes == 2 && ano % 4 == 0) {
        	dd = 1;
        	dm = 3;
        	da = ano;
        }else if (dia == 28 && mes == 2 && ano % 4 == 0) {
        	dd = 29;
        	dm = mes;
        	da = ano;
        }else if(dia == 31 && mes == 12)
        {
        	dd = 1;
        	dm = 1;
        	da = ano + 1;
        }else
        {
        	dd = dia +1;
        	dm = mes;
        	da = ano;
        }

        if(valid == 1)
        {
        	System.out.println("Amanhã será "+dd+"/"+dm+"/"+da);
        }
       
	}
}
