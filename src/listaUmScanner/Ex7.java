package listaUmScanner;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do salário:");
		double sal = leia.nextDouble();
		
		int salInteiro = (int) sal;
		double salDouble = (double) salInteiro;
		
		System.out.println(sal);
		System.out.println(salInteiro);
		System.out.println(salDouble);
		
		leia.close();
	}

}
