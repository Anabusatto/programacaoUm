package exerciciosIf;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = leia.nextInt();
		
		if(num>0) {
			System.out.println("O número é positivo");
		}
		leia.close();
	}

}
