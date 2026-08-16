package listaUmScanner;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		int n2 = leia.nextInt();
		
		int divisaoInteira = (int) n1/n2;
		double divisaoDouble = (double) n1/n2;
		
		System.out.println(divisaoInteira);
		System.out.println(divisaoDouble);
		
		leia.close();
	}

}
