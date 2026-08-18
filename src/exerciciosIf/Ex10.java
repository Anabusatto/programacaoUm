package exerciciosIf;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius");
		double temp = leia.nextDouble();
		
		if(temp >= 30) {
			System.out.println("Está calor!");
		}else {
			System.out.println("Está agradável");
		}
		leia.close();
	}

}
