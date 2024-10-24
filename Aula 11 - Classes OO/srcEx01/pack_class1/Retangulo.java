package pack_class1;

public class Retangulo {
	
	public double altura;
	public double largura;

	public static double calcularArea(double altura, double largura){
		return altura * largura;
	}
	
	public static double calcularPerimetro(double altura, double largura){
		return (altura * 2) + (largura * 2);
	}
	
	public static double calcularDiagonal(double altura, double largura){
		return Math.floor(Math.sqrt((Math.pow(altura, 2)) + (Math.pow(largura, 2))));
	}
	
	public static void exibirDados(double area, double perimetro, double diagonal){
		System.out.println("Área do Retângulo: " + area);
		System.out.println("Perímetro do Retângulo: " + perimetro);
		System.out.println("Diagonal do Retângulo: " + diagonal);
	}
}
