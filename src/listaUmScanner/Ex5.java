package listaUmScanner;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do arroz:");
		double valorArroz = leia.nextDouble();
		
		System.out.println("Digite o valor do feijão:");
		double valorFeijao = leia.nextDouble();
		
		System.out.println("Digite o valor do óleo:");
		double valorOleo = leia.nextDouble();
		
		System.out.println("Valor total da compra: R$"+(valorArroz+valorFeijao+valorOleo));
		System.out.println("Valor médio dos produtos: R$"+(valorArroz+valorFeijao+valorOleo)/3);
		
		leia.close();
	}

}
