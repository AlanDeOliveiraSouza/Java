import javax.swing.JOptionPane;

public class Exercicio5_3 {
	
	public static void main(String args[]){
		
		// Lendo dois n�meros e informando se s�o multiplos entre si.
		
		int valueA = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro valor:"));
		
		int valueB = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo valor:"));
		
		if (valueA >= valueB) {
			
			if (valueA % valueB == 0) {
				JOptionPane.showMessageDialog(null, "Os valores S�O MULTIPLOS.");
			} else {
				JOptionPane.showMessageDialog(null, "Os valores N�O S�O MULTIPLOS.");
			}
			
		} else if (valueB > valueA) {
			if (valueB % valueA == 0) {
				JOptionPane.showMessageDialog(null, "Os valores S�O MULTIPLOS");
			} else {
				JOptionPane.showMessageDialog(null, "Os valores N�O S�O MULTIPLOS");
			}
		}
		
		
	}
	
}