package listaUmScanner;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a temperatura:");
		double temperatura = leia.nextDouble();
		
		String mensagem = (temperatura>25) ? "Dia quente" : "Dia agradável";
		
		System.out.println("-Temperatura: "+temperatura);
		System.out.println("-Situação: "+mensagem);
		
		leia.close();
	}

}
