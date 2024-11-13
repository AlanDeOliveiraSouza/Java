import java.util.Scanner;
import java.io.File;

public class Exercicio01 {
	
	public static void main(String[] args) {
		// Escreva um programa que solicita ao usuário um caminho de diretório e verifica se o diretório existe.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o caminho para um diretório existente em disco:");
		String caminho = leitor.next();
		
		File local = new File(caminho);
		
		if (local.isDirectory()) {
			System.out.println("O caminho existe, diretório encontrado!!");
		} else {
			System.out.println("O caminho não existe, diretório não encontrado");
		}
		
		leitor.close();
		
	}

}
