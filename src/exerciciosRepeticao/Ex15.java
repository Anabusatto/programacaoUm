package exerciciosRepeticao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double soma = 0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite a "+(i+1)+"ª nota:");
			double nota = leia.nextDouble();
			soma+=nota;
		}
		
		System.out.println("A soma das notas é: "+soma);
		System.out.println("A média das notas é: "+(soma/5));
		
		leia.close();
	}

}
