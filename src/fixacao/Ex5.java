package fixacao;

public class Ex5 {

	public static void main(String[] args) {
		
		double[] val = {1.2,1,2,3,4,5,6,7,8,9};
		double soma = 0;
		double media = 0;
		double maiorVal = 0;
		double menorVal = 99;
		int quantA = 0;
		
		for(int i=0; i<val.length; i++) {
			val[i] += soma;
			if(val[i] > maiorVal) {
				val[i] = maiorVal;
			}
			if(val[i] < menorVal) {
				val[i] = menorVal;
			}
		}
		media = soma/val.length;
		for(int i=0; i<val.length; i++) {
			if(val[i] > media) {
				quantA++;
			}
		}
		System.out.println("Todos os valores do vetor: ");
		System.out.println(val+" - ");
		System.out.println("A soma de todos os valores: "+soma);
		System.out.println("A média de todos os valores é: "+media);
		System.out.println("O maior valor é: "+maiorVal);
		System.out.println("O menor valor é: "+menorVal);
		System.out.println("A quantidade de valores acima da média é: "+quantA);
	}

}
