
public class ExemploVet1 {
	
	public static void main(String args[]){
		
		int[] numeros = new int[5];
		
		// Atribuir valores
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;

		int soma = 0;
		
		System.out.println("Valores do vetor: ");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento no índice " + i + ": " + numeros[i]);
			soma += numeros[i];

		}
		
		System.out.println("");
		
		// Mostrando somatória dos elementos
		System.out.println("Soma dos valores do vetor: " + soma);
		
		System.out.println("");
		
		// Mostrando média dos elementos
		int media = soma / numeros.length;
		System.out.println("Média dos valores do vetor: " + media);
		
		System.out.println("");
		
		// Alterando um valor no vetor
		numeros[2] = 100;
		
		soma = 0;
		
		System.out.println("-----------------------");
		System.out.println("VALORES APÓS ALTERAÇÃO:");
		System.out.println("-----------------------");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento no índice " + i + ": " + numeros[i]);
			soma += numeros[i];
		}
		
		System.out.println("");
		
		// Mostrando somatória dos elementos após alteração
		System.out.println("Soma dos valores do vetor após alteração: " + soma);
		
		System.out.println("");
		
		// Mostrando média dos elementos
		media = soma / numeros.length;
		System.out.println("Média dos valores do vetor após a alteração: " + media);

	}
}
