import java.util.Scanner;


public class Exercicio_01 {

	public static void main(String[] args) {
		
		// Utilizando o Scanner:
		
		Scanner lendo_num = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		
		int number01 = lendo_num.nextInt();
		
		System.out.println("Entre com o Segundo número:");
		
		int number02 = lendo_num.nextInt();
		
		int soma = number01 + number02;
		
		System.out.println("Soma: " + number01 + " + " + number02 + " = " + soma + ". ");
		
		lendo_num.close();

	}

}
