
public class ExemploMat {

	public static void main(String args[]){
		
		int[][] matriz = {
				{1,  2,  3,  4},
				{5,  6,  7,  8},
				{9, 10, 11, 12}
		};
		
		int soma = 0;
		
		System.out.println("Elementos da matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			
			System.out.println("Elementos da linha de valor " + i + ": ");
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				soma+= matriz[i][j];
			}
			
			System.out.println("");
			
		}
		
		System.out.println("");
		
		// Soma de todos os elementos da matriz
		System.out.println("Soma dos valores da matriz: " + soma);
		
		System.out.println("");

		// Média de todos os valores da matriz
		float media = soma / 12;
		System.out.println("Média dos valores da matriz: " + media);
		
	}
	
}
