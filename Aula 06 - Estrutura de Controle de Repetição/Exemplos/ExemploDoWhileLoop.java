import java.util.Scanner;


public class ExemploDoWhileLoop {

	
	public static void main(String[] args) {
		
		// Exemplo de laço de repetição "DoWhile", com entrada com "Scanner"
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Digite um número (0 para sair!):");
			numero = entrada.nextInt();
		} while (numero != 0);
		
		entrada.close();
		System.out.println("Fim do Loop");
	}

}
