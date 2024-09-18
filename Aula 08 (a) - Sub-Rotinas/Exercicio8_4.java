import javax.swing.JOptionPane;

public class Exercicio8_4 {

	public static void main(String[] args) {
		// Leia um número e retorne 1 se o mesmo for positivo ou 0 se for negativo.
		
		String number = JOptionPane.showInputDialog("Informe um número: 'Positivo = 1; Negativo = 0'");
		JOptionPane.showMessageDialog(null, identificar(number));
		
	}	
	
	public static int identificar(String number){
		double num = Double.parseDouble(number);
		if(num >= 0){
			return 1;
		}
		
		return 0;
		
	}
}
