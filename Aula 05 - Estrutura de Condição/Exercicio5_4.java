import javax.swing.JOptionPane;

public class Exercicio5_4 {
	
	public static void main(String args[]){
		
		// Calculando o tempo de dura��o de um jogo
		
		int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o hor�rio de in�cio do jogo:"));
		
		int fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o hor�rio do t�rmino do jogo:"));
		
		int duracao = 0;
		
		if ((inicio >= 0 && inicio < 23) && (fim >= 0 && fim < 23)) {
			if (inicio == fim) {
				JOptionPane.showMessageDialog(null, "O jogo durou 24 horas.");
			} else if (inicio < fim) {
				duracao = fim - inicio;
				JOptionPane.showMessageDialog(null, "O jogo durou " + duracao + " horas.");
			} else if (inicio > fim) {
				duracao = (24 - inicio) + fim;
				JOptionPane.showMessageDialog(null, "O jogo durou " + duracao + " horas.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Hor�rio inv�lido");
		}
		
		
	}
	
}