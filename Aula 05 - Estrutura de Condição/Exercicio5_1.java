import java.util.Scanner;

public class Exercicio5_1 {
	
	public static void main(String args[]){
				
		// Ler um n�mero e informar se ele � negativo ou n�o.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira um n�mero para saber se ele � negativo ou n�o:");
		
		int num = leitor.nextInt();
		
		if (num < 0) {
			System.out.println("O n�mero � NEGATIVO.");
		} else {
			System.out.println("O n�mero N�O � NEGATIVO");
		}
		
	    leitor.close();
	}
	
}
