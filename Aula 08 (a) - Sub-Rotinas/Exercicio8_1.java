import javax.swing.JOptionPane;

public class Exercicio8_1 {

	public static void main(String[] args) {
		// Receber dois n�meros do usu�rio e calcular a media desses n�meros.
		
		double media = calcularMedia(JOptionPane.showInputDialog("Digite um n�mero"), JOptionPane.showInputDialog("Digite outro n�mero"));
		System.out.println(media);
	}
	
	public static double calcularMedia(String n1, String n2) {
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		return (num1 + num2) / 2;
	}
	
	
}
