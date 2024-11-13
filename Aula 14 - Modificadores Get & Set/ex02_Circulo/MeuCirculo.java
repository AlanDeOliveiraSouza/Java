package ex02_Circulo;

public class MeuCirculo {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		
		circulo.setRaio(3.5);
		
		double areaCirculo = circulo.calcularArea(circulo.getRaio());
		
		System.out.println("||Circulo||");
		System.out.println("Raio: " + circulo.getRaio());
		System.out.println("Área: " + areaCirculo);

	}

}
