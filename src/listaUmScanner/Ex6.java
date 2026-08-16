package listaUmScanner;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do monitor (em Dólar):");
		double valorDolar = leia.nextDouble();
		
		double valorReal = valorDolar*5.62;
		
		System.out.println("O monitor custa R$"+valorReal);
		
		leia.close();
	}

}
