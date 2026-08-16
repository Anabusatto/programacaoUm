package listaUmScanner;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		String nome = leia.nextLine();
		
		System.out.println("Digite a idade do aluno:");
		int idade = leia.nextInt();
		
		System.out.println("Digite a altura do aluno:");
		double altura = leia.nextDouble();
		
		System.out.println("Digite o peso do aluno:");
		double peso = leia.nextDouble();
		
		System.out.println("Digite o sexo do aluno:");
		char sexo = leia.next().charAt(0);
		
		System.out.println("Situação da matrícula:");
		boolean matricula = leia.nextBoolean();
		
		System.out.println("Nome do aluno: "+nome);
		System.out.println("Idade do aluno: "+idade);
		System.out.println("Altura do aluno: "+altura);
		System.out.println("Peso do aluno: "+peso);
		System.out.println("Sexo do aluno: "+sexo);
		System.out.println("Situação da matrícula: "+matricula);
		
		leia.close();
	}

}
