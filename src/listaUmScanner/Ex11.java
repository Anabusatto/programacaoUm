package listaUmScanner;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		String nome = leia.nextLine();
		
		System.out.println("Digite a nota do aluno:");
		double nota = leia.nextDouble();
		
		System.out.println("Digite a frequência do aluno:");
		int frequencia = leia.nextInt();
		
		String mensagem = (nota>=6&&frequencia>=75) ? "Aprovado" : "Reprovado";
		
		System.out.println("Aluno "+nome+" "+mensagem);
		
		leia.close();
	}

}
