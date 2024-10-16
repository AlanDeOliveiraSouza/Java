import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// Receber um número Double e um valor de potência. Arredonde o número em Double (tirando as casas decimais) e calcule a potência em seguida.
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número decimal:"));
		int potencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a potência a ser calculada:"));
		JOptionPane.showMessageDialog(null, "O resultado é: " + converterCalcular(numero, potencia));
	}
	
	public static double converterCalcular(double num, int pot) {
		double resultado = Math.pow(Math.floor(num), pot);
		
		return resultado;
	}
}
