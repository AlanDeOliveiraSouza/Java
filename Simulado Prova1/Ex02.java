import java.util.Scanner;


public class Ex02 {
	public static void main(String args[]){
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu sal�rio aqui:");
		double salario = leitura.nextDouble();
		
		if(salario <= 645 && salario > 0){
			System.out.println("At� 1 sal�rio");
		} else if(salario > 645 && salario <= 1935){
			System.out.println("At� 3 sal�rios");
		} else if(salario > 1935 && salario <= 3225){
			System.out.println("At� 5 sal�rios");
		} else if(salario > 3225){
			System.out.println("Acima de 5 sal�rios");
		} else{
			System.out.println("Sal�rio inv�lido");
		}
		
		leitura.close();
	}
}
