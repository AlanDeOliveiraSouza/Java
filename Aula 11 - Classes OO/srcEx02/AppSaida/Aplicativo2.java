package AppSaida;

import java.util.Scanner;
import pack_class2.Empregado;

public class Aplicativo2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Empregado pessoa = new Empregado();
		
		System.out.println("Insira o nome do empregado:");
		pessoa.nome = leitor.next();
		
		System.out.println("Insira o salário bruto do empregado:");
		pessoa.salarioBruto = leitor.nextDouble();
		
		System.out.println("Insira o valor a ser descontado do salário bruto:");
		pessoa.desconto = leitor.nextDouble();
		
		double liquido = pessoa.calcularSalarioLiquido(pessoa.salarioBruto, pessoa.desconto);
		
		System.out.println("Informe o valor a ser acrescido no salário, em reais:");
		double acrescimo = leitor.nextDouble();
			
		double salario = pessoa.aumentarSalario(liquido, acrescimo);
		
		pessoa.exibirResultado(salario, pessoa.nome);
		
		leitor.close();

	}

}
