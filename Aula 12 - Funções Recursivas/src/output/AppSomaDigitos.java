package output;

import java.util.Scanner;
import classe.Metodos;

public class AppSomaDigitos {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

	    Metodos somaDig = new Metodos();
	    
	    System.out.println("Digite o n�mero para somar seus d�gitos: ");
	    somaDig.numero = leitor.nextInt();

	    System.out.println("A soma dos digitos do n�mero " + somaDig.numero + " �: " + somaDig.somarDigitos(somaDig.numero, 0));

	    leitor.close();

	}
}
