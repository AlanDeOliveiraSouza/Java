import javax.swing.JOptionPane;


public class Exercicio06_01 {

	public static void main(String args[]){
		// Entre com uma senha, caso esteja correta exibira "Acesso Permitido", caso contrário "Acesso Negado". Utilizando o DoWhile.
		int senha = 2002;
		int entrada = 0;
		do {
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Insira a senha para entrar:"));
			if(entrada == senha){
				JOptionPane.showMessageDialog(null, "Acesso Permitido!");
			} else {
				JOptionPane.showMessageDialog(null, "Senha Inválida!");
			}
		} while (senha != entrada);
		
	}
	
}
