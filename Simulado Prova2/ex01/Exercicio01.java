package ex01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio01 {

	public static void main(String args[]) throws FileNotFoundException, IOException{
		
		
		BufferedReader in = null;
		
		try {
			File arquivo = new File("C:/Documents and Settings/Fatec/Meus documentos/SimuladoP2/src/ex01/arquivo.csv");
			in = new BufferedReader(new FileReader(arquivo));
			int i = 0;
			System.out.println("|||MEUS PRODUTOS|||");
			String linha;
			while ((linha = in.readLine()) != null) {
				i++;
				String[] array = linha.split(";");
				
				Classe p = new Classe();
				
				p.setProduto(array[0]);
				p.setQtde(array[1]);
				p.setPreco(array[2]);
				
				System.out.println("-------------------------");
				System.out.println("|" + i + "º Produto|");
				System.out.println("Nome: " + p.getProduto());
				System.out.println("Quantidade: " + p.getQtde());
				System.out.println("Preço: " + p.getPreco());
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (in != null) {in.close();}
		}
	}
	
}
