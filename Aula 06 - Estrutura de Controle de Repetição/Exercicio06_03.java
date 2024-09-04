import java.util.Scanner;


public class Exercicio06_03 {

	public static void main(String args[]){
		// Ler um valor X entre 1 e 1000 e informar quantos ímpares existem no intervalo, incluindo ele, caso seja possível.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor X inteiro:");
		int x = entrada.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0){
				System.out.println(i);
			}
		}
		
		entrada.close();
	}
	
}
