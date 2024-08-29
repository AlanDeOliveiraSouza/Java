
public class Aula05CondicaoIF {


	public static void main(String[] args) {
		int num = 10;
		if (num > 0) {
			System.out.println("O numero é positivo.");
		} else if (num < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é ZERO");
		}
		
		// Exemplo de Condição encadeada
		if (num > 0 && num <= 100) {
			System.out.println("O número está entre 0 e 100.");
		}
		
		if (num % 2 == 0) {
			System.out.println("O número é positivo e PAR.");
			
		}
		

	}

}
