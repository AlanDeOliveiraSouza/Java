package output;

import java.util.Scanner;
import classe.Metodos;

public class AppPotencia {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

	    Metodos calPot = new Metodos();

	    System.out.println("Digite o numero a calcular pot�ncia:");
	    calPot.numero = leitor.nextInt();

	    System.out.println("Digite o expoente a calcular o n�mero:");
	    calPot.expoente = leitor.nextInt();

	    System.out.println("O resultado da pot�ncia �: " + calPot.calcularPotencia(calPot.numero, calPot.expoente));

	    leitor.close();
	}
}
