package output;

import java.util.Scanner;

import classe.Metodos;

public class AppFibonacci {

	public static void main(String[] args) {
		
		Scanner leitor  = new Scanner(System.in);
		
		Metodos numFib = new Metodos();
		
		System.out.println("Digite qual n�mero da sequ�ncia de Fibonacci deseja exibir:");
		numFib.numero = leitor.nextInt();
		
		System.out.println("O " + numFib.numero + "� n�mero da Sequ�ncia de Fibonacci �: " + numFib.numerosFibonacci(numFib.numero - 1));
		
		leitor.close();
	}

}