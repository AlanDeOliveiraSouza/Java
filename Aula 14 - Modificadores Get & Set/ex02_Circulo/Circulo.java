package ex02_Circulo;

public class Circulo {
	/*
	  Crie uma classe Circulo com um atributo privado raio (double).
	  Forne�a m�todos GET e SET para o raio.
	  Adicione um m�todo calcularArea que retorna a �rea do c�rculo (f�rmula: pi * raio^2).
	  Crie uma inst�ncia da classe, defina o raio e exiba a �rea do c�rculo.
	*/
	
	private double raio;
	
	public double getRaio(){
		return this.raio;
	}
	public void setRaio(double novoRaio){
		this.raio = novoRaio;
	}
	
	public double calcularArea(double raio){
		return Math.PI * Math.pow(raio, 2);
	}
}
