package listaUmScanner;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		String nome = leia.nextLine();
		
		System.out.println("Digite a nota 1:");
		double n1 = leia.nextDouble();
		
		System.out.println("Digite a nota 2:");
		double n2 = leia.nextDouble();
		
		System.out.println("Aluno: "+nome);
		System.out.println("Nota 1: "+n1);
		System.out.println("Nota 2: "+n2);
		System.out.println("Média: "+(n1+n2)/2);
		
		leia.close();
	}

}
