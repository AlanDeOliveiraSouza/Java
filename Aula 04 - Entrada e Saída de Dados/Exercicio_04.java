import javax.swing.JOptionPane;


public class Exercicio_04 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do funcionário: "));
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: "));
		
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor a receber por hora trabalhada: "));
		
		double salario = horas * valor;
		
		JOptionPane.showMessageDialog(null, "Número do Funcionário = " + numero + "\n" + String.format("Salário = R$%.2f", salario));
		
	}

}
