package listaUmScanner;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a idade:");
		int idade = leia.nextInt();
		
		String mensagem = (idade>=18) ? "Maior de idade" : "Menor de idade";
		
		System.out.println(mensagem);
		
		leia.close();
	}

}
