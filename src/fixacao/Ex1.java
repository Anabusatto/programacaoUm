package fixacao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double[] nota = new double[5];
		double media = 0;
		
		for(int i=0; i<nota.length; i++) {
			System.out.println("Digite a nota: ");
			nota[i] = leia.nextDouble();
			media += nota[i];
		}
		for(int i=0;i<nota.length;i++) {
			System.out.print(nota[i]+" - ");
		}
		System.out.println("\n A média das notas digitadas é: "+(media/nota.length));
		leia.close();
	}

}
