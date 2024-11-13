import java.util.Scanner;
import java.io.File;

public class Exercicio01 {
	
	public static void main(String[] args) {
		// Escreva um programa que solicita ao usu�rio um caminho de diret�rio e verifica se o diret�rio existe.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o caminho para um diret�rio existente em disco:");
		String caminho = leitor.next();
		
		File local = new File(caminho);
		
		if (local.isDirectory()) {
			System.out.println("O caminho existe, diret�rio encontrado!!");
		} else {
			System.out.println("O caminho n�o existe, diret�rio n�o encontrado");
		}
		
		leitor.close();
		
	}

}
