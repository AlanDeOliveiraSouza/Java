import javax.swing.JOptionPane;


public class Ex04 {
	public static void main(String args[]){
		
		int vendas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade total de vendas de seu funcion�rio:"));
		double totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total de vendas de seu funcion�rio:"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o sal�rio fixo de seu funcion�rio:"));
		double porVenda = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por venda que ganha seu funcion�rio:"));
		
		JOptionPane.showMessageDialog(null, "O sal�rio do funcion�rio �: " + calcularSalario(vendas, totalVendas, salario, porVenda));
	}
	
	public static double calcularSalario(int vds, double total, double sal, double pVenda){
		double salarioFinal = sal + (pVenda * vds) + ((total / 100) * 5);
		return salarioFinal;
	}
}
