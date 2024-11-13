import java.util.Scanner;
import java.io.File;

public class Exercicio02 {

	public static void main(String[] args) {
		// Escreva um programa que lista todos os arquivos em um diret�rio espec�fico.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um caminho para listar os arquivos do diret�rio:");
		String caminho = leitor.next();
		
		File local = new File(caminho);

		if(local.isDirectory()){
			System.out.println("\nOs arquivos s�o:\n");
			String[] arqs = local.list();
			for(String arquivo: arqs){
				System.out.println(arquivo);
			}
		} else {
			System.out.println("O diret�rio n�o existe!");
		}
		
		leitor.close();
		
	}

}
