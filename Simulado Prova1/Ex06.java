import javax.swing.JOptionPane;


public class Ex06 {
	public static void main(String args[]){
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		
		if(numero >= 0){
			// Considerando 0 como positivo.
			JOptionPane.showMessageDialog(null, "O número é positivo.");
		} else {
			JOptionPane.showMessageDialog(null, "O número é negativo.");
		} 
	}
}
