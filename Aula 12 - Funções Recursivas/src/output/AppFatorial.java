package output;

import java.util.Scanner;

import classe.Metodos;

public class AppFatorial {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Metodos fatNum = new Metodos();
		
		System.out.println("Insira o n�mero a ser calculado o fatorial:");
		
		fatNum.numero = leitor.nextInt();
		
		System.out.println("O fatorial de " + fatNum.numero + " �: " + fatNum.calcFatorial(fatNum.numero));
		
		leitor.close();

	}

}
