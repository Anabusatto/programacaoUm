package listaUmScanner;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		String nome = leia.nextLine();
		
		System.out.println("Digite o curso do aluno:");
		String curso = leia.nextLine();
		
		System.out.println("Digite a idade do aluno:");
		int idade = leia.nextInt();
		
		System.out.println("===============");
		System.out.println("\nAluno: "+nome);
		System.out.println("\nCurso: "+curso);
		System.out.println("\nIdade: "+idade);
		System.out.println("\n===============");
		
		leia.close();
	}

}
