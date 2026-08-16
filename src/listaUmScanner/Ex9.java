package listaUmScanner;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Possui ingresso?");
		boolean ingresso = leia.nextBoolean();
		
		System.out.println("Possui documento?");
		boolean documento = leia.nextBoolean();
		
		System.out.println("Possui acompanhante de maior idade?");
		boolean acompanhante = leia.nextBoolean();
		
		System.out.println(ingresso&&documento);
		//Os dois precisam ser verdadeiros
		
		System.out.println(ingresso||documento);
		//Apenas um precisa ser verdadeiro
		
		System.out.println(!documento);
		//Inverte o resultado
		
		System.out.println(ingresso&&(documento||acompanhante));
		//Precisa de ingresso e documento ou acompanhante
		
		System.out.println(!(ingresso&&documento));
		//Inverte o resultado
		
		leia.close();
	}

}
