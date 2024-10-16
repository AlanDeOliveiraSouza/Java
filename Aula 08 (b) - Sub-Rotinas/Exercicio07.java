import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// Ler três números e retornar o valor mediano (aquele que fica localizado no meio deles).
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor:");
		double num1 = leitura.nextDouble();
		System.out.println("Insira o segundo valor:");
		double num2 = leitura.nextDouble();
		System.out.println("Insira o terceiro valor:");
		double num3 = leitura.nextDouble();
		
		double resultado = detectarMediano(num1, num2, num3);
		if (resultado == 0){
			System.out.println("Não existe um valor mediano (Existem valores iguais).");
		} else { 
			System.out.println("O valor mediano é: " + resultado);
		}
		
		leitura.close();
	}
	
	public static double detectarMediano(double n1, double n2, double n3) {
		double valor;
		
		if ((n1 > n2 && n1 < n3) || (n1 < n2 && n1 > n3)){
			valor = n1;
		} else if ((n2 < n1 && n2 > n3) || (n2 > n1 && n2 < n3)){
			valor = n2;
		} else if ((n3 < n2 && n3 > n1) || (n3 > n2 && n3 < n1)) {
			valor = n3;
		} else {
			valor = 0;
		}

		return valor;
	}
}
