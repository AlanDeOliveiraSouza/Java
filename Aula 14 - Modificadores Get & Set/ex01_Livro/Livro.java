package ex01_Livro;

public class Livro {
	/*
	Crie uma classe chamada Livro com os seguintes atributos privados: 
	  titulo (String)
      autor (String)
      anoPublicacao (int)
    Forne�a m�todos GET e SET para cada atributo.
    Em seguida, crie uma inst�ncia da classe, atribua valores aos atributos e exiba as informa��es do livro.
	*/

	private String titulo;
	private String autor;
	private int anoPublicacao;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	
}
