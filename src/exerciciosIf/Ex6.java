package exerciciosIf;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num  = leia.nextInt();;
		
		if(num %2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		}
		leia.close();
	}

}
