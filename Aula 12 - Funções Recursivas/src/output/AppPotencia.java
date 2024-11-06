package output;

import java.util.Scanner;
import classe.Metodos;

public class AppPotencia {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

	    Metodos calPot = new Metodos();

	    System.out.println("Digite o numero a calcular potência:");
	    calPot.numero = leitor.nextInt();

	    System.out.println("Digite o expoente a calcular o número:");
	    calPot.expoente = leitor.nextInt();

	    System.out.println("O resultado da potência é: " + calPot.calcularPotencia(calPot.numero, calPot.expoente));

	    leitor.close();
	}
}
