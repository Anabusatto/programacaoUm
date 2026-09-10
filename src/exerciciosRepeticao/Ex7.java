package exerciciosRepeticao;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite a senha:");
			int senha = leia.nextInt();
			
			if(senha != 1234) {
				System.out.println("Senha incorreta!");
			}
			else {
				System.out.println("Acesso permitido!");
				break;
			}
		}while(1<2);
		leia.close();
	}

}
