import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio06 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Escreva um programa em Java que conte o número de palavras em um arquivo de texto.
		
		BufferedReader in = null;
		
		int cont = 0;
		
		try {
			File arquivo = new File("C:/AulaJava/Arquivos/MeuTexto.txt");
			in = new BufferedReader(new FileReader(arquivo));
			
			System.out.println("Contando quantas palavras contém o arquivo");
			System.out.println("Local do arquivo: " + arquivo);
			
			String linha;
			while((linha = in.readLine()) != null) {
				for(int i = 0; i < linha.length(); i++) {
					if(Character.isWhitespace(linha.charAt(i))) {
						// A cada espaço encontrado, será contada uma palavra.
						cont++;
					}
				}
				// No final de cada linha um espaço também será contado, para que não faltem palavras no final.
				cont++;
			}
		} finally {
			System.out.println("O arquivo contém " + cont + " palavras.");
			
			if(in != null) {in.close();}
		}
	}
}
