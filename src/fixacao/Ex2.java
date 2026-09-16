package fixacao;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		
		Random sorteia = new Random();
		int maiorNum = 0;
		int menorNum = 999;
		int[] num = new int[10];
		int posMenor = 0;
		int posMaior = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = sorteia.nextInt(87);
			System.out.print(num[i]+" - ");
			
			if(num[i] < menorNum) {
				menorNum = num[i];
				posMenor = i;
			}
			if(num[i] > maiorNum) {
				maiorNum = num[i];
				posMaior = i;
			}
		}
		System.out.println("O maior número do vetor é "+maiorNum);
		System.out.println("A posição do maior número é: "+posMaior);
		System.out.println("O menor número do vetor é: "+menorNum);
		System.out.println("A posição do menor número é: "+posMenor);
		
		
	}

}
