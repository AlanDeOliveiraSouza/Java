package output;

import java.util.Scanner;

import classe.Metodos;

public class AppFibonacci {

	public static void main(String[] args) {
		
		Scanner leitor  = new Scanner(System.in);
		
		Metodos numFib = new Metodos();
		
		System.out.println("Digite qual número da sequência de Fibonacci deseja exibir:");
		numFib.numero = leitor.nextInt();
		
		System.out.println("O " + numFib.numero + "º número da Sequência de Fibonacci é: " + numFib.numerosFibonacci(numFib.numero - 1));
		
		leitor.close();
	}

}