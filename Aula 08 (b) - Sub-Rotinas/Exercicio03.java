import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// Receber o nome do usu�rio e apresentar uma sauda��o personalizada.
		
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		
		JOptionPane.showMessageDialog(null, saudacao(nome));
		
	}
	
	public static String saudacao(String name) {
		
		String saudacao = "Seja Bem-Vindo " + name + "!!! Esperamos que voc� tenha uma �tima experi�ncia conosco.";
		
		return saudacao;
	}
}
