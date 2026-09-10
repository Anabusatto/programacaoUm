package exerciciosRepeticao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = leia.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
		leia.close();
	}

}
