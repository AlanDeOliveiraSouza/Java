
public class ExemploWhileLoop {

	
	public static void main(String[] args) {
		
		// Exemplo de laço de repetição "While"
		
		int numero = 101;
		
		while (numero  % 5 != 0 && numero % 7 != 0) {
			numero++;
		}
		System.out.println("Primeiro número maior que 100 divisível por 5 e 7 é : " + numero);
	}

}
