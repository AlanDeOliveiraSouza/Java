import javax.swing.JOptionPane;

public class Exercicio5_7 {
	
	public static void main(String args[]){
		
		// Lendo valores X e Y e informando em qual quadrante do plano cartesiano o ponto se encontra.
		
		double numX = Double.parseDouble(JOptionPane.showInputDialog("Insira uma coordenada X:"));
		
		double numY = Double.parseDouble(JOptionPane.showInputDialog("Insira uma coordenada Y:"));
		
		if (numX == 0 && numY == 0){
			JOptionPane.showMessageDialog(null, "O ponto se encontra na ORIGEM.");
		} else if (numX == 0 && numY != 0) {
			JOptionPane.showMessageDialog(null, "O ponto se encontra no EIXO X.");
		} else if (numX != 0 && numY == 0) {
			JOptionPane.showMessageDialog(null, "O ponto se encontra no EIXO Y.");
		} else if (numX > 0 && numY > 0) {
			JOptionPane.showMessageDialog(null, "O ponto se encontra no QUADRANTE 1.");
		} else if (numX < 0 && numY > 0) {
			JOptionPane.showMessageDialog(null, "O ponto se encontra no QUADRANTE 2.");
		} else if (numX < 0 && numY < 0) {
			JOptionPane.showMessageDialog(null, "O ponto se encontra no QUADRANTE 3.");
		} else if (numX > 0 && numY < 0) {
			JOptionPane.showMessageDialog(null, "O ponto se encontra no QUADRANTE 4.");
		}
		
	}
	
}