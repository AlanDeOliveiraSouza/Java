import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Receber um n�mero inteiro, calcular e exibir seu dobro.
		
		Scanner acao = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int num = acao.nextInt();
		System.out.println("O dobro de " + num + " �: " + dobrarNumero(num));
		acao.close();
	}
	
	public static int dobrarNumero(int n1) {
		int dobro = n1 * 2;
		
		return dobro;
	}
}
