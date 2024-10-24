package App;

import util.Utilidades;

public class App {

	public static void main(String[] args) {
		
		double celsius = Utilidades.fahrenheitParaCelsius(100);
		
		String mensagem = "100ºF é igual a " + Math.floor(celsius) + "ºC";
		
		Utilidades.exibirMensagem(mensagem);
		Utilidades.exibirMensagem("Reutilização de Classes!!");
	}

}
