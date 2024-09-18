import javax.swing.JOptionPane;

public class Exercicio8_3 {

	public static void main(String[] args) {
		// Receber dois n�meros do usu�rio e realizar a opera��o aritm�tica que o mesmo desejar.
		JOptionPane.showMessageDialog(null, "Informe a opera��o a ser executada:");
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 = Adi��o; 2 = Subtra��o; 3 = Multiplica��o; 4 = Divis�o."));
		String number1 = JOptionPane.showInputDialog("Informe um n�mero: ");
		String number2 = JOptionPane.showInputDialog("Informe outro n�mero: ");
		switch (operacao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Resultado da soma = " + somar(number1, number2));
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Resultado da subtra��o = " + subtrair(number1, number2));
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Resultado da multiplica��o = " + multiplicar(number1, number2));
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Resultado da divis�o = " + dividir(number1, number2));
			break;
		default:
			JOptionPane.showMessageDialog(null,"Opera��o inv�lida!");
			break;
		}
	}
	public static double somar(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		double resutd = n1 + n2;
		return resutd;
	}
	public static double subtrair(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		double resutd = n1 - n2;
		return resutd;
	}
	public static double multiplicar(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		double resutd = n1 * n2;
		return resutd;
	}
	public static double dividir(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		double resutd = n1 / n2;
		return resutd;
	}
	
}
