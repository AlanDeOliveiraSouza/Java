import java.util.Scanner;

public class Exercicio5_2 {
	
	public static void main(String args[]){
		
		// Ler um n�mero e informar se ele � par ou impar.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero e descubra se ele � PAR ou IMPAR:");
		
		int num = leitor.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " � um n�mero PAR.");
		} else {
			System.out.println(num + " � um n�mero IMPAR.");
		}
		
		leitor.close();
	}
	
}