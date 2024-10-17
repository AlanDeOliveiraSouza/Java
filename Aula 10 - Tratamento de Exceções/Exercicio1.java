import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String args[]){
		// Escrever um programa que solicita ao usuário dois números e realiza a divisão do primeiro pelo segundo. 
		// Certifique-se de tratar a exceção de divisão por 0.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número (dividendo):");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número (divisor):");
		int num2 = entrada.nextInt();
		
		try{
			
			int divisao = num1 / num2;
			
			System.out.println("Divisão = " + divisao);
		
		}catch(ArithmeticException a){
			
			System.out.println("É impossível calcular, divisão por 0!!");
			
		}finally{
			
			System.out.println("Código finalizado!");
			
		}
		
		entrada.close();
	}
}
