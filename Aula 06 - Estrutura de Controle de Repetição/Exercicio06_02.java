import javax.swing.JOptionPane;


public class Exercicio06_02 {

	public static void main(String args[]){
		// Entrar com coordenadas e informar em qual quadrante ela se encontra. Caso uma delas seja nula, encerrará o código.
		
		int x = 1;
		int y = 1;
		
		while (x != 0 || y != 0){
			x = Integer.parseInt(JOptionPane.showInputDialog("Entre com uma coordenada X:"));
			y = Integer.parseInt(JOptionPane.showInputDialog("Entre com uma coordenada Y:"));
			if (x > 0 && y < 0){
				JOptionPane.showMessageDialog(null, "A coordenada se localiza no QUARTO quadrante.");
			} else if (x < 0 && y < 0){
				JOptionPane.showMessageDialog(null, "A coordenada se localiza no TERCEIRO quadrante.");
			} else if (x < 0 && y > 0){
				JOptionPane.showMessageDialog(null, "A coordenada se localiza no SEGUNDO quadrante.");
			} else if (x > 0 && y > 0){
				JOptionPane.showMessageDialog(null, "A coordenada se localiza no PRIMEIRO quadrante.");
			}
			if (x == 0 || y == 0){
				break;
			}
		}
		
	}
	
}
