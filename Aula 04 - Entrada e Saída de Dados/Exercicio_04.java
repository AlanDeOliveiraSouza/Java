import javax.swing.JOptionPane;


public class Exercicio_04 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero do funcion�rio: "));
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: "));
		
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor a receber por hora trabalhada: "));
		
		double salario = horas * valor;
		
		JOptionPane.showMessageDialog(null, "N�mero do Funcion�rio = " + numero + "\n" + String.format("Sal�rio = R$%.2f", salario));
		
	}

}
