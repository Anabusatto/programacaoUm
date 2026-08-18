package exerciciosIf;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		int n2 = leia.nextInt();
		
		if(n1 > n2) {
			System.out.println("O primeiro número é maior");
		}else if(n2>n1) {
			System.out.println("O segundo número é maior");
		}else {
			System.out.println("Os números são iguais");
		}
		leia.close();
	}

}
