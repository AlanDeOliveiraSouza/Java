package output;

import javax.swing.JOptionPane;
import classe.Metodos;

public class AppInverterString {

	public static void main(String[] args) {
		
	    Metodos invString = new Metodos();
	    
	    invString.texto = JOptionPane.showInputDialog("Digite o texto a ser invertido (espaços, números e símbolos serão removidos):");
	    
	    JOptionPane.showMessageDialog(null, "Texto invertido: \n" + invString.inverterString(invString.texto, (invString.texto.length() - 1)));
		
	}
}
