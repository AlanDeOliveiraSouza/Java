import javax.swing.JOptionPane;

public class Exercicio8_7 {

	public static void main(String[] args) {
		// Analisar o pre�o de um produto antes e depois e informar o percentual de acr�scimo do valor.
		
		double vlAntigo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor antigo: "));
		double vlNovo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor novo: "));
		JOptionPane.showMessageDialog(null, "Houve uma mudan�a de " + calcularPercentualAcrescimo(vlAntigo, vlNovo) + "%");
	}	
	
	public static String calcularPercentualAcrescimo(double vlAntigo, double vlNovo){
		double percent = ((vlNovo / vlAntigo) - 1) * 100;
		
		String percentual = String.format("%.2f", percent);
		
		return percentual;
	}
}
