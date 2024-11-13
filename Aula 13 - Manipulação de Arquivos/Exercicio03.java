import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Exercicio03 {

	public static void main(String[] args) throws IOException {
		// Escreva um programa que cria um novo arquivo em um diretório especificado.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o caminho da pasta em que deseja criar um novo arquivo (formato .txt):");
		String caminho = leitor.next();
		
		File pasta = new File(caminho);
		
		File local = null;
		
		if(pasta.isDirectory()){
			
			System.out.println("Digite o nome do arquivo:");
			String nome = leitor.next();
			
			local = new File((caminho + nome + ".txt"));
			local.createNewFile();
		}
		if(local.exists()){
			System.out.println("Arquivo criado com sucesso!");
		}
	}
}
