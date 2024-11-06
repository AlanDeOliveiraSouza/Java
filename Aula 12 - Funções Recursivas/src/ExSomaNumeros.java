// Calcular a soma de todos os números de 1 até um número N usando recursão

public class ExSomaNumeros {

	public static int soma(int n){
		
		if (n == 1) {
			return 1;
		} else {
			return n + soma(n - 1); // Chamada recursiva
		}
		
	}
	
	public static void main(String[] args) {
		
		int n = 5; // 1 + 2 + 3 + 4 + 5 = 15
		
		System.out.println("A soma de 1 até " + n + " é " + soma(n));
		
	}

}
