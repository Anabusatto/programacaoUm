package fixacao;

public class Ex4 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,12,34,56,67,78,90};
		int numPar = 0;
		int numImp = 0;
		int numMaior = 0;
		int numMenor = 0;
		
		for(int i=0; i<num.length; i++) {
			if(num[i] %2 == 0) {
				numPar ++;
			}else {
				numImp++;
			}
			if(num[i] > 10) {
				numMaior++;
			}else {
				numMenor++;
			}
		}
		System.out.println("Quantidade de números ímpares: "+numImp);
		System.out.println("Quantidade de números pares: "+numPar);
		System.out.println("Quantidade de números maiores que 10: "+numMaior);
		System.out.println("Quantidade de números menores ou igual a 10: "+numMenor);
	}

}
