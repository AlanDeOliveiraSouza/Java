import java.util.Scanner;


public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner coleta = new Scanner(System.in);
		
		System.out.println("C�digo da Pe�a 1: ");
		
		int peca1 = coleta.nextInt();
		
		System.out.println("Quantidade de Pe�a 1: ");
		
		int qtde1 = coleta.nextInt();
		
		// Entrar com " , " em vez de " . "
		
		System.out.println("Valor da Pe�a 1");
		
		float valor1 = coleta.nextFloat();
		
		System.out.println("C�digo da Pe�a 2: ");
		
		int peca2 = coleta.nextInt();
		
		System.out.println("Quantidade de Pe�a 2: ");
		
		int qtde2 = coleta.nextInt();
		
		System.out.println("Valor da Pe�a 2");
		
		// Entrar com " , " em vez de " . "
		
		float valor2 = coleta.nextFloat();
		
		System.out.println("� pagar da Pe�a 1: R$" + (qtde1 * valor1));
		
		System.out.println("� pagar da Pe�a 2: R$" + (qtde2 * valor2));
		
		double total = (qtde1 * valor1) + (qtde2 * valor2);
		
		String resultado = String.format("%.2f", total);
		
		System.out.println("Valor a Pagar: R$" + resultado);
		
		coleta.close();
	}

}
