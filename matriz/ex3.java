package matriz;

import java.util.Random;
public class ex3 {
	public static void main(String[] args) {
        int v[][] = new int[3][4];
        int i, j, soma = 0;
        Random in = new Random();

        for(i=0; i<3; i++){
            for(j=0; j<4;j++){
                v[i][j] = in.nextInt()%50;
            }
        }
        
        for(i=0; i<3; i++) {
        	for(j=0; j<3; j++) {
        		soma += v[i][j];
        	}
        	v[i][3] = soma;
        	soma = 0;
        }
        
        for (i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("[ ");
            for (j = 0; j < 4; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.print("]");
        }
        System.out.println();
	}
}

