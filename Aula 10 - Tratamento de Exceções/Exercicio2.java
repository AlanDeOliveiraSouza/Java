import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[]){
		// Escrever um programa que converta uma String em Int. Caso ocorra exceção, trate-a.
		
		System.out.println("Digite um dado que possa ser convertido em número inteiro:");
		Scanner entrada = new Scanner(System.in);
		
		String dados = entrada.next();
		
		try{
			
			int dadosInt = Integer.parseInt(dados);
			
			System.out.println("\nInteiro recebido: " + dadosInt + ". \n");
			
		}catch(NumberFormatException a){
			
			System.out.println("\nNão é possível transformar texto em número inteiro!! \n");
			
		}finally{
			
			System.out.println("Execução finalizada!");
		
		}
		
		entrada.close();
	}
}
