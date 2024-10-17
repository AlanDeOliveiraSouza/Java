import java.util.Scanner;


public class Ex02 {
	public static void main(String args[]){
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu salário aqui:");
		double salario = leitura.nextDouble();
		
		if(salario <= 645 && salario > 0){
			System.out.println("Até 1 salário");
		} else if(salario > 645 && salario <= 1935){
			System.out.println("Até 3 salários");
		} else if(salario > 1935 && salario <= 3225){
			System.out.println("Até 5 salários");
		} else if(salario > 3225){
			System.out.println("Acima de 5 salários");
		} else{
			System.out.println("Salário inválido");
		}
		
		leitura.close();
	}
}
