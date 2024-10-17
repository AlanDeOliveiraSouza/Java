import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String args[]){
		// Escrever um programa que solicita ao usu�rio dois n�meros e realiza a divis�o do primeiro pelo segundo. 
		// Certifique-se de tratar a exce��o de divis�o por 0.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero (dividendo):");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero (divisor):");
		int num2 = entrada.nextInt();
		
		try{
			
			int divisao = num1 / num2;
			
			System.out.println("Divis�o = " + divisao);
		
		}catch(ArithmeticException a){
			
			System.out.println("� imposs�vel calcular, divis�o por 0!!");
			
		}finally{
			
			System.out.println("C�digo finalizado!");
			
		}
		
		entrada.close();
	}
}
