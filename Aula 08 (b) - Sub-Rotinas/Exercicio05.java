import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		// Calcular o fatorial de um número informado pelo usuário.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para descobrir seu fatorial:"));
		JOptionPane.showMessageDialog(null, "Fatorial de " + numero + ": " + calcularFatorial(numero));
	}
	
	public static int calcularFatorial(int num) {
		int fatorial = 1;
		
		for(int i = num; i > 1; i--){
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}
}
