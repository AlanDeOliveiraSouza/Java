import java.util.Scanner;

public class Exercicio5_1 {
	
	public static void main(String args[]){
				
		// Ler um número e informar se ele é negativo ou não.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira um número para saber se ele é negativo ou não:");
		
		int num = leitor.nextInt();
		
		if (num < 0) {
			System.out.println("O número é NEGATIVO.");
		} else {
			System.out.println("O número NÃO É NEGATIVO");
		}
		
	    leitor.close();
	}
	
}
