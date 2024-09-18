import javax.swing.JOptionPane;

public class Exercicio8_3 {

	public static void main(String[] args) {
		// Receber dois números do usuário e realizar a operação aritmética que o mesmo desejar.
		JOptionPane.showMessageDialog(null, "Informe a operação a ser executada:");
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 = Adição; 2 = Subtração; 3 = Multiplicação; 4 = Divisão."));
		String number1 = JOptionPane.showInputDialog("Informe um número: ");
		String number2 = JOptionPane.showInputDialog("Informe outro número: ");
		switch (operacao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Resultado da soma = " + somar(number1, number2));
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Resultado da subtração = " + subtrair(number1, number2));
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Resultado da multiplicação = " + multiplicar(number1, number2));
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Resultado da divisão = " + dividir(number1, number2));
			break;
		default:
			JOptionPane.showMessageDialog(null,"Operação inválida!");
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
