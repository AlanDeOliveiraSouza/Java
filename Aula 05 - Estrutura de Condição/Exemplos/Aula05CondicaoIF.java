
public class Aula05CondicaoIF {


	public static void main(String[] args) {
		int num = 10;
		if (num > 0) {
			System.out.println("O numero � positivo.");
		} else if (num < 0) {
			System.out.println("O n�mero � negativo.");
		} else {
			System.out.println("O n�mero � ZERO");
		}
		
		// Exemplo de Condi��o encadeada
		if (num > 0 && num <= 100) {
			System.out.println("O n�mero est� entre 0 e 100.");
		}
		
		if (num % 2 == 0) {
			System.out.println("O n�mero � positivo e PAR.");
			
		}
		

	}

}
