import java.util.Scanner;

public class Exercicio5_2 {
	
	public static void main(String args[]){
		
		// Ler um número e informar se ele é par ou impar.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um número e descubra se ele é PAR ou IMPAR:");
		
		int num = leitor.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " é um número PAR.");
		} else {
			System.out.println(num + " é um número IMPAR.");
		}
		
		leitor.close();
	}
	
}