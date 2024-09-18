import javax.swing.JOptionPane;

public class Exercicio8_1 {

	public static void main(String[] args) {
		// Receber dois números do usuário e calcular a media desses números.
		
		double media = calcularMedia(JOptionPane.showInputDialog("Digite um número"), JOptionPane.showInputDialog("Digite outro número"));
		System.out.println(media);
	}
	
	public static double calcularMedia(String n1, String n2) {
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		return (num1 + num2) / 2;
	}
	
	
}
