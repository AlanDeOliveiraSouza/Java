import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Ler um número N do usuário e criar um vetor de tamanho N. Depois, exibir os números negativos no vetor.

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de números que irá digitar:");
		int num = leitor.nextInt();
		int[] vetor = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetor[i] = leitor.nextInt();
			
		}
		
		System.out.println("");
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0){
				System.out.print(vetor[i] + " ");
			}
		}
		
		leitor.close();
	}


}
