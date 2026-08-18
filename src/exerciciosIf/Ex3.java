package exerciciosIf;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		double nota = leia.nextDouble();
		
		if(nota >=7) {
			System.out.println("O aluno foi aprovado!");
		}
		leia.close();
	}

}
