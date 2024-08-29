import javax.swing.JOptionPane;

public class Exercicio5_6 {
	
	public static void main(String args[]){
		
		// Lendo um número e informando em qual intervalo de números ele está inserido.
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
		
		if (numero >= 0 && numero <= 25) {
			JOptionPane.showMessageDialog(null, "Intervalo: [0, 25]");
		} else if (numero > 25 && numero <= 50) {
			JOptionPane.showMessageDialog(null, "Intervalo: [25, 50]");
		} else if (numero > 50 && numero <= 75) {
			JOptionPane.showMessageDialog(null, "Intervalo: [51, 75]");
		} else if (numero > 75 && numero <= 100) {
			JOptionPane.showMessageDialog(null, "Intervalo: [76, 100]");
		} else {
			JOptionPane.showMessageDialog(null, "Não faz parte de nenhum intervalo.");
		}
	}
	
}