package ex02_Circulo;

public class Circulo {
	/*
	  Crie uma classe Circulo com um atributo privado raio (double).
	  Forneça métodos GET e SET para o raio.
	  Adicione um método calcularArea que retorna a área do círculo (fórmula: pi * raio^2).
	  Crie uma instância da classe, defina o raio e exiba a área do círculo.
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
