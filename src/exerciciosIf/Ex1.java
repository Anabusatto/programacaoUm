package exerciciosIf;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade:");
		int id = leia.nextInt();
		
		if (id >= 18) {
			System.out.println("Maior de idade");
		}
		leia.close();
	}

}
