import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Leia N números e armazene num vetor. Depois informe quais são pares e a quantidade de pares.

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe quantos números serão digitados:");
		int num = leitor.nextInt();
		int[] vetor = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número:");
			vetor[i] = leitor.nextInt();
		}
		int cont = 0;
		System.out.println("NÚMEROS PARES:");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0){
				System.out.print(vetor[i] + " ");
				cont++;
			}
		}
		
		System.out.println("");
		System.out.println("Quantidade de valores pares: " + cont);

		leitor.close();
	}
}
