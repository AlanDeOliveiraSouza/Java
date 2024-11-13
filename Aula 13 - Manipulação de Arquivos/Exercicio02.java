import java.util.Scanner;
import java.io.File;

public class Exercicio02 {

	public static void main(String[] args) {
		// Escreva um programa que lista todos os arquivos em um diretório específico.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um caminho para listar os arquivos do diretório:");
		String caminho = leitor.next();
		
		File local = new File(caminho);

		if(local.isDirectory()){
			System.out.println("\nOs arquivos são:\n");
			String[] arqs = local.list();
			for(String arquivo: arqs){
				System.out.println(arquivo);
			}
		} else {
			System.out.println("O diretório não existe!");
		}
		
		leitor.close();
		
	}

}
