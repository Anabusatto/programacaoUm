package listaUmScanner;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário:");
		String nome = leia.nextLine();
		
		System.out.println("Digite o salário do funcionário:");
		double sal = leia.nextDouble();
		
		System.out.println("Digite o tempo de empresa do funcionário (anos):");
		int tempo = leia.nextInt();
		
		double bonus = (tempo>=5) ? 500 : 0;
		double salFinal = sal+bonus;
		
		System.out.println("Nome: "+nome);
		System.out.println("Salário: R$"+sal);
		System.out.println("Bônus: R$"+bonus);
		System.out.println("Salário Final: R$"+salFinal);
		
		leia.close();
	}

}
