package ex01_Livro;

public class Peregrino {

	public static void main(String[] args) {
		
		Livro peregrino = new Livro();
		
		peregrino.setTitulo("O Peregrino");
		peregrino.setAutor("John Bunyan");
		peregrino.setAnoPublicacao(1678);
		
		System.out.println("|||DADOS DO LIVRO|||");
		System.out.println("Título: " + peregrino.getTitulo());
		System.out.println("Autor: " + peregrino.getAutor());
		System.out.println("Ano de publicação: " + peregrino.getAnoPublicacao());
		
	}

}
