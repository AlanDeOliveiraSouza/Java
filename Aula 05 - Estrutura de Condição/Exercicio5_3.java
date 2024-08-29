import javax.swing.JOptionPane;

public class Exercicio5_3 {
	
	public static void main(String args[]){
		
		// Lendo dois números e informando se são multiplos entre si.
		
		int valueA = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro valor:"));
		
		int valueB = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo valor:"));
		
		if (valueA >= valueB) {
			
			if (valueA % valueB == 0) {
				JOptionPane.showMessageDialog(null, "Os valores SÃO MULTIPLOS.");
			} else {
				JOptionPane.showMessageDialog(null, "Os valores NÃO SÃO MULTIPLOS.");
			}
			
		} else if (valueB > valueA) {
			if (valueB % valueA == 0) {
				JOptionPane.showMessageDialog(null, "Os valores SÃO MULTIPLOS");
			} else {
				JOptionPane.showMessageDialog(null, "Os valores NÃO SÃO MULTIPLOS");
			}
		}
		
		
	}
	
}