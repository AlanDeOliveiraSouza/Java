package ex03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercicio03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		BufferedReader in = null;
		int palavras = 0;
		int[] linhas = new int[7];
		
		try{
			File arquivo = new File("C:/Documents and Settings/Administrador/workspace/SimuladoP2/src/ex03/Texto.txt");
			in = new BufferedReader(new FileReader(arquivo));
			int c = -1;
			String linha;
			while ((linha = in.readLine()) != null){
				c++;
				for(int i = 0; i < linha.length(); i++) {
					if(Character.isWhitespace(linha.charAt(i))) {
						palavras++;
					}
				}
				palavras++;
				linhas[c] = palavras;
				palavras = 0;
			}
			int media = 0;
			for (int i = 0; i < linhas.length; i++) {
				media = media + linhas[c];
			}
			System.out.println("O arquivo possui " + linhas.length + " linhas e uma média de " + media + " palavras por linhas.");
		}finally{
			if(in != null){in.close();}
		}
	}
}