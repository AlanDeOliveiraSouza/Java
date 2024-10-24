package pack_class2;

public class Empregado {
	
	public String nome;
	public double salarioBruto;
	public double desconto;

	public static double calcularSalarioLiquido(double bruto, double desconto){
		
		return bruto - desconto;
	}
	
	public static double aumentarSalario(double liquido, double acrescimo){
		
		return liquido + acrescimo;
	}
	
	public static void exibirResultado(double salario, String nome){
		
		System.out.println("Sálario final de " + nome + ": " + salario);
		
	}

}
