import java.util.Scanner;


public class Exercicio06_06 {

	public static void main(String args[]){
		// Calcular a soma dos dígitos de um número informado.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número inteiro:");
		String numero = entrada.next();
		int soma = 0;
		for (int i = 0; i < numero.length(); i++){
			soma = soma + Integer.parseInt(numero.substring(i, i+1));
		}
		System.out.println("Soma dos dígitos: " + soma);
	
		entrada.close();
	}
}
