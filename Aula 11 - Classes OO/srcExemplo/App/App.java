package App;

import util.Utilidades;

public class App {

	public static void main(String[] args) {
		
		double celsius = Utilidades.fahrenheitParaCelsius(100);
		
		String mensagem = "100�F � igual a " + Math.floor(celsius) + "�C";
		
		Utilidades.exibirMensagem(mensagem);
		Utilidades.exibirMensagem("Reutiliza��o de Classes!!");
	}

}
