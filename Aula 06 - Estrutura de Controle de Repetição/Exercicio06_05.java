import java.util.Scanner;


public class Exercicio06_05 {

	public static void main(String args[]){
		// Calcular o fatorial de um número, que será fornecido pelo usuário.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número inteiro positivo para que seja calculado seu fatorial:");
		int num = entrada.nextInt();
		int i;
		int fat = 1;
		for(i = num; i > 0; i--){
			fat = fat * i;
		}
		System.out.println("O fatorial de " + num + " é: " + fat);
	}
}
