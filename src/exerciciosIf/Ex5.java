package exerciciosIf;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade:");
		int id = leia.nextInt();
		
		if(id >= 60) {
			System.out.println("O cliente possui direito a desconto");
		}
		leia.close();
	}

}
