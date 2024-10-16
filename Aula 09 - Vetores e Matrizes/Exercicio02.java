import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Insira N n�meros em um vetor, imprima-os e mostre a soma e a m�dia deles.

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos n�meros ser�o digitados? ");
		int num = leitor.nextInt();
		double[] vetor = new double[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero:");
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
		System.out.println("M�DIA: " + media);
		
		leitor.close();
	}
}
