package exerciciosIf;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite a nota:");
		double nota = leia.nextDouble();
		
		if(nota>=7) {
			System.out.println("O aluno foi aprovado");
		}else {
			System.out.println("O aluno foi reprovado");
		}
		leia.close();
	}

}
