package listaSwitch;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = leia.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("Domingo :p");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
		        break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}
		leia.close();
	}

}
