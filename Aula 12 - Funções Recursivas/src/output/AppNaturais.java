package output;

import classe.Metodos;

import java.util.Scanner;

public class AppNaturais {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Metodos somaNat = new Metodos();
		
		System.out.println("Insira quais os N primeiros n�meros naturais a serem somados:");
		somaNat.numero = leitor.nextInt();
		
		System.out.println("A soma dos numeros naturais informados �: " + somaNat.somaNaturais(somaNat.numero));

	}

}
