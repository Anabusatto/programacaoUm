package listaSwitch;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número da bebida:");
		int beb = leia.nextInt();
		
		switch(beb) {
			case 1:
				System.out.println("Água");
				break;
			case 2:
				System.out.println("Refrigerante");
				break;
			case 3:
				System.out.println("Suco");
				break;
			default:
				System.out.println("Opção inválida");
		}
		
		System.out.println("Digite o número do lanche:");
		int lan = leia.nextInt();
		
		switch(lan) {
			case 1:
				System.out.println("Cachorro-quente");
				break;
			case 2:
				System.out.println("Hambúrguer");
				break;
			case 3:
				System.out.println("Pizza");
				break;
			default:
				System.out.println("Opção inválida");
		}
		leia.close();
	}

}
