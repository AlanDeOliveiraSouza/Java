package util;

public class Utilidades {

	public static double fahrenheitParaCelsius(double fahrenheit){
		return (fahrenheit - 32) * 5 / 9;
	}
	
	public static double celsiusParaFahrenheit(double celsius){
		return (celsius * 9 / 5) + 32;
	}
	
	// Método para exibir uma mensagem
	public static void exibirMensagem(String mensagem){
		System.out.println("Mensagem: " + mensagem);
	}
}
