
public class ExemploForLoop {

	
	public static void main(String[] args) {
		
		// Exemplo de la�o de repeti��o "For", testando "Continue" e "Break".
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				continue;
			}
			if (i == 8) {
				break;
			}
			System.out.println(i);
			
		}

	}

}
