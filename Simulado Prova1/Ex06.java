import javax.swing.JOptionPane;


public class Ex06 {
	public static void main(String args[]){
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro:"));
		
		if(numero >= 0){
			// Considerando 0 como positivo.
			JOptionPane.showMessageDialog(null, "O n�mero � positivo.");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero � negativo.");
		} 
	}
}
