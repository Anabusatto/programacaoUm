package fixacao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] nomes = {"Nana","Nani","Fefa","Math","Bia","Lili","Jasmim","Lola"};
		int posNome = 0;
		boolean achouu = false;
		
		System.out.println("Qual nome você deseja encontrar?");
		String busca = leia.nextLine();
		
		for(int i=0; i<nomes.length; i++) {
			if(busca.equals(nomes[i])){
				achouu = true;
				posNome = i;
			}
		}
		if(achouu == false) {
			System.out.println("O nome não foi encontrado :C");
		}else {
			System.out.println("O nome foi encontrado :p");
			System.out.println("A posição do nome no vetor é: "+posNome);
		}
		leia.close();
		
	}

}
