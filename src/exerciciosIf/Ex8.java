package exerciciosIf;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade:");
		int id = leia.nextInt();
		
		if(id >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		leia.close();
	}

}
