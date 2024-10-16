import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Calcule o en�simo n�mero da sequ�ncia de Fibonacci (de acordo com o n�mero dado pelo usu�rio).
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o valor de uma posi��o na sequ�ncia de Fibonacci:");
		int fibonacci = leitura.nextInt();
		System.out.println("O valor pedido �: " + valorFibonacci(fibonacci));
		
		leitura.close();
	}
	
	public static int valorFibonacci(int fib) {
		int anterior = 0;
		int proximo = 1;
		int calculo = 0;
		
		for(int i = 1; i <= fib; i++){
			anterior = proximo;
			proximo = calculo;
			calculo = anterior + proximo;
		}

		return calculo;
	}
}
