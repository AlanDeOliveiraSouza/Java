import java.util.Scanner;


public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner coletor = new Scanner(System.in);
		
		System.out.println("Entre com o valor inteiro A: ");
		
		int valor1 = coletor.nextInt();
		
		System.out.println("Entre com o valor inteiro B: ");
		
		int valor2 = coletor.nextInt();

		System.out.println("Entre com o valor inteiro C: ");
		
		int valor3 = coletor.nextInt();

		System.out.println("Entre com o valor inteiro D: ");
		
		int valor4 = coletor.nextInt();
		
		int diferenca = (valor1 * valor2 - valor3 * valor4);
		
		System.out.println("Diferença = " + diferenca);
		
		coletor.close();
		
	}

}
