
public class ExemploWhileLoop {

	
	public static void main(String[] args) {
		
		// Exemplo de la�o de repeti��o "While"
		
		int numero = 101;
		
		while (numero  % 5 != 0 && numero % 7 != 0) {
			numero++;
		}
		System.out.println("Primeiro n�mero maior que 100 divis�vel por 5 e 7 � : " + numero);
	}

}
