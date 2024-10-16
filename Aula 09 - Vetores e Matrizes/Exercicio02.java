import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Insira N números em um vetor, imprima-os e mostre a soma e a média deles.

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados? ");
		int num = leitor.nextInt();
		double[] vetor = new double[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			vetor[i] = leitor.nextDouble();
		}
		
		double soma = 0;
		System.out.print("VALORES DO VETOR: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		System.out.println("");
		System.out.println("SOMA: " + soma);
		System.out.println("MÉDIA: " + media);
		
		leitor.close();
	}
}
