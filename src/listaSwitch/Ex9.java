package listaSwitch;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número dos produtos de informática:");
		int info = leia.nextInt();
		
		switch(info) {
			case 1:
				System.out.println("Notebook");
				break;
			case 2:
				System.out.println("Mouse");
				break;
			case 3:
				System.out.println("Teclado");
				break;
			default:
				System.out.println("Opção inválida");
		}
		
		System.out.println("Digite o número dos produtos de telefonia:");
		int tele = leia.nextInt();
		
		switch(tele) {
			case 1:
				System.out.println("Smartphone");
				break;
				
			case 2:
				System.out.println("Carregador");
				break;
			case 3:
				System.out.println("Fone de ouvido");
				break;
			default:
				System.out.println("Opção inválida");
		}
		leia.close();
	}

}
