import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[]){
		// Escrever um programa que converta uma String em Int. Caso ocorra exce��o, trate-a.
		
		System.out.println("Digite um dado que possa ser convertido em n�mero inteiro:");
		Scanner entrada = new Scanner(System.in);
		
		String dados = entrada.next();
		
		try{
			
			int dadosInt = Integer.parseInt(dados);
			
			System.out.println("\nInteiro recebido: " + dadosInt + ". \n");
			
		}catch(NumberFormatException a){
			
			System.out.println("\nN�o � poss�vel transformar texto em n�mero inteiro!! \n");
			
		}finally{
			
			System.out.println("Execu��o finalizada!");
		
		}
		
		entrada.close();
	}
}
