package exerciciosRepeticao;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("===== MENU ===== \n1 - Cadastrar \n2 - Consultar \n3 - Excluir \n0 - Sair");
			opcao = leia.nextInt();
		}while(opcao != 0);
		
		System.out.println("Programa encerrado.");
		leia.close();
	}

}
