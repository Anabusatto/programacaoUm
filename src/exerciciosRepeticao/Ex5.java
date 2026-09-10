package exerciciosRepeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int soma = 0;
		
		while(1<2) {
			System.out.println("Digite um número (negativo para parar):");
			int num = leia.nextInt();
			
			if(num < 0) {
				break;
			}
			else {
				soma += num;
			}
		}
		System.out.println("Resultado da soma: "+soma);
		leia.close();
	}

}
