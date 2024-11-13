import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio07 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Escreva um programa em Java que copie o conteúdo de um arquivo para outro.
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		File arquivo = new File("C:/AulaJava/Arquivos/MeuTexto.txt");
		File novoArquivo = new File("C:/AulaJava/Arquivos/MeuNovoTexto.txt");
		
		System.out.println("Local do arquivo: " + arquivo);
		
		try {
			
			in = new BufferedReader(new FileReader(arquivo));
			out = new PrintWriter(novoArquivo);
			
			String linha;
			while((linha = in.readLine()) != null) {
				out.println(linha);
			}
			
		} finally {
			if(novoArquivo.exists()) {
				System.out.println("Arquivo copiado com sucessso!!");
			}
			if(in != null) {in.close();}
			if(out != null) {out.close();}
		}
	}
}
