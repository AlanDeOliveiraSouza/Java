import javax.swing.JOptionPane;

public class Exercicio8_2 {

	public static void main(String[] args) {
		// Utilizando o exercício anterior, calcular a média de acordo com a quantidade de números que o usuário informar, criando uma sub-rotina para cada caso.
		
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos números serão inseridos:"));
		
		switch (qtde) {
		case 2:
			double media2 = calcularMedia2(JOptionPane.showInputDialog("Digite um número"), JOptionPane.showInputDialog("Digite outro número"));
			JOptionPane.showMessageDialog(null, "Média dos valores = " + media2);
			break;
			
		case 3:
			double media3 = calcularMedia3(JOptionPane.showInputDialog("Digite um número"), JOptionPane.showInputDialog("Digite outro número"), JOptionPane.showInputDialog("Digite outro número"));
			JOptionPane.showMessageDialog(null, "Média dos valores = " + media3);
			break;
			
		case 4:
			double media4 = calcularMedia4(JOptionPane.showInputDialog("Digite um número"), JOptionPane.showInputDialog("Digite outro número"), JOptionPane.showInputDialog("Digite outro número"), JOptionPane.showInputDialog("Digite outro número"));
			JOptionPane.showMessageDialog(null, "Média dos valores = " + media4);
			break;
			
		case 5:
			double media5 = calcularMedia5(JOptionPane.showInputDialog("Digite um número"), JOptionPane.showInputDialog("Digite outro número"), JOptionPane.showInputDialog("Digite outro número"), JOptionPane.showInputDialog("Digite outro número"), JOptionPane.showInputDialog("Digite outro número"));
			JOptionPane.showMessageDialog(null, "Média dos valores = " + media5);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Quantidade inválida!");
			break;
		}
	}
	public static double calcularMedia2(String n1, String n2) {
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		return (num1 + num2) / 2;
	}
	public static double calcularMedia3(String n1, String n2, String n3) {
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double num3 = Double.parseDouble(n3);
		return (num1 + num2 + num3) / 3;
	}
	public static double calcularMedia4(String n1, String n2, String n3, String n4) {
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double num3 = Double.parseDouble(n3);
		double num4 = Double.parseDouble(n4);
		return (num1 + num2 + num3 + num4) / 4;
	}
	public static double calcularMedia5(String n1, String n2, String n3, String n4, String n5) {
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double num3 = Double.parseDouble(n3);
		double num4 = Double.parseDouble(n4);
		double num5 = Double.parseDouble(n5);
		return (num1 + num2 + num3 + num4 + num5) / 5;
	}
}
