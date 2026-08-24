package listaSwitch;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma letra:");
		char let = leia.next().charAt(0);
		
		switch(let) {
			case 'A':
				System.out.println("Excelente");
				break;
			case 'B':
				System.out.println("Bom");
				break;
			case 'C':
				System.out.println("Regular");
				break;
			case 'D':
				System.out.println("Insuficiente");
				break;
			case 'F':
				System.out.println("Reprovado");
				break;
			default:
				System.out.println("Conceito inválido.");
		}
		leia.close();
	}

}
