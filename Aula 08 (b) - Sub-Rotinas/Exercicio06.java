import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// Receber um n�mero Double e um valor de pot�ncia. Arredonde o n�mero em Double (tirando as casas decimais) e calcule a pot�ncia em seguida.
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero decimal:"));
		int potencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a pot�ncia a ser calculada:"));
		JOptionPane.showMessageDialog(null, "O resultado �: " + converterCalcular(numero, potencia));
	}
	
	public static double converterCalcular(double num, int pot) {
		double resultado = Math.pow(Math.floor(num), pot);
		
		return resultado;
	}
}
