package output;

import java.util.Scanner;
import classe.Metodos;

public class AppSomaDigitos {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

	    Metodos somaDig = new Metodos();
	    
	    System.out.println("Digite o número para somar seus dígitos: ");
	    somaDig.numero = leitor.nextInt();

	    System.out.println("A soma dos digitos do número " + somaDig.numero + " é: " + somaDig.somarDigitos(somaDig.numero, 0));

	    leitor.close();

	}
}
