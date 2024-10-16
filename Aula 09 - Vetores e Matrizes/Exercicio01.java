import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Ler um n�mero N do usu�rio e criar um vetor de tamanho N. Depois, exibir os n�meros negativos no vetor.

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de n�meros que ir� digitar:");
		int num = leitor.nextInt();
		int[] vetor = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print("Digite o " + (i + 1) + "� n�mero: ");
			vetor[i] = leitor.nextInt();
			
		}
		
		System.out.println("");
		
		System.out.println("N�MEROS NEGATIVOS:");
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0){
				System.out.print(vetor[i] + " ");
			}
		}
		
		leitor.close();
	}


}
