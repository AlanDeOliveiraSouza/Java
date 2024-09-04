import java.util.Scanner;

public class Exercicio06_04 {

	public static void main(String args[]){
		// Ler a quantidade de números que serão informados, depois identificar se os números a serem lidos fazem parte do intervalo [10,20].
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a quantidade de números a serem lidos:");
		int qtde = entrada.nextInt();
		int i;
		int n;
		int dentro = 0;
		int fora = 0;
		for (i = 0; i < qtde; i++){
			System.out.println("Insira um número:");
			n = entrada.nextInt();
			if (n >= 10 && n <= 20){
				dentro++;
			} else {
				fora++;
			}
		}
		System.out.println(dentro + "in");
		System.out.println(fora + "out");
		
		entrada.close();
	}
}
