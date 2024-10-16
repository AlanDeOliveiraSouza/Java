import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// Receber o nome do usuário e apresentar uma saudação personalizada.
		
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		
		JOptionPane.showMessageDialog(null, saudacao(nome));
		
	}
	
	public static String saudacao(String name) {
		
		String saudacao = "Seja Bem-Vindo " + name + "!!! Esperamos que você tenha uma ótima experiência conosco.";
		
		return saudacao;
	}
}
