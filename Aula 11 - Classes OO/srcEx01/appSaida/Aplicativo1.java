package appSaida;

import java.util.Scanner;

import pack_class1.Retangulo;

public class Aplicativo1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Retangulo forma  = new Retangulo();
		
		System.out.println("Insira a altura do retângulo:");
		forma.altura = leitor.nextDouble();
		
		System.out.println("Insira a largura do retângulo:");
		forma.largura = leitor.nextDouble();
		
		// Calculando os dados solicitados
		double area = Retangulo.calcularArea(forma.altura, forma.largura);
		double perimetro = Retangulo.calcularPerimetro(forma.altura, forma.largura);
		double diagonal = Retangulo.calcularDiagonal(forma.altura, forma.largura);
		
		// Exibindo os dados
		Retangulo.exibirDados(area, perimetro, diagonal);
		
		leitor.close();
		
	}

}
