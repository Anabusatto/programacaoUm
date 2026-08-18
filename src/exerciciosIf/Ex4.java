package exerciciosIf;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = leia.nextInt();
		
		if(num %5 == 0) {
			System.out.println("O número é múltiplo de 5");
		}
		leia.close();
	}

}
