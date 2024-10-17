import java.util.Scanner;


public class Ex01 {
	public static void main(String args[]){
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira um valor em dólar para converter em real:");
		double dolar = leitura.nextDouble();
		double reais = (dolar * 5.15);
		System.out.println("O valor de US$" + dolar + " em real é: R$" + reais);
		
		leitura.close();
	}
}
