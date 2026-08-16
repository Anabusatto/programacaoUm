package listaUmScanner;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		int n2 = leia.nextInt();
		
		System.out.println("Valor da soma: "+(n1+n2));
		System.out.println("Valor da subtração: "+(n1-n2));
		System.out.println("Valor da multiplicação: "+(n1*n2));
		System.out.println("Valor da divisão: "+(n1/n2));
		System.out.println("Resto da divisão: "+(n1%n2));
		
		leia.close();
	}

}
