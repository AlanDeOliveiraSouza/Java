import java.util.Scanner;


public class Exercicio06_07 {

	public static void main(String args[]){
		// Calcular a sequ�ncia de Fibonacci, at� a quantidade de n�meros fornecidos.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a quantidade de n�meros da sequ�ncia de Fibonacci a serem exibidos:");
		int num = entrada.nextInt();
		
		int fn1 = 0;
		int fn2 = 1;
		int soma;
		System.out.println("0");
		for (int i = 1; i < num; i++){
			soma = fn1 + fn2;
			fn1 = fn2;
			fn2 = soma;
			System.out.println(soma);
		}
		
		entrada.close();
	}
}
