import javax.swing.JOptionPane;

public class Exercicio8_6 {

	public static void main(String[] args) {
		// Receber um valor de tempo em segundos e exibir em formato de hora.
		
		String num = JOptionPane.showInputDialog("Digite a quantidade de segundos: ");
		JOptionPane.showMessageDialog(null, "Horário convertido: " + converterHoras(num));
	}	
	public static String converterHoras(String seconds){
		int segundos = Integer.parseInt(seconds);
		int minutos = 0;
		int horas = 0;
		
		if (segundos >= 60) {
			minutos = segundos / 60;
			segundos = segundos % 60;
		}
		if (minutos >= 60) {
			horas = minutos / 60;
			minutos = minutos % 60;
		}
		String horasF = String.format("%d", horas);
		String minutosF = String.format("%d", minutos);
		String segundosF = String.format("%d", segundos);
		
		if (horas <= 9) {
			horasF = "0" + horas;
		}
		if (minutos <= 9) {
			minutosF = "0" + minutos;
		}
		if (segundos <= 9) {
			segundosF = "0" + segundos;
		}
		return horasF + ":" + minutosF + ":" + segundosF;
		
	}
}
