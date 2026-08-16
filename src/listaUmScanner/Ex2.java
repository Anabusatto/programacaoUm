package listaUmScanner;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		String produto = leia.next();
		
		System.out.println("Digite o código do produto:");
		int cod = leia.nextInt();
		
		System.out.println("Digite o preço do produto:");
		double preco = leia.nextDouble();
		
		System.out.println("Digite a quantidade em estoque:");
		int estoque = leia.nextInt();
		
		System.out.println("Nome do produto: "+produto);
		System.out.println("Código do produto: "+cod);
		System.out.println("Preço do produto: R$"+preco);
		System.out.println("Quantia em estoque: "+estoque);
		
		leia.close();
	}

}
