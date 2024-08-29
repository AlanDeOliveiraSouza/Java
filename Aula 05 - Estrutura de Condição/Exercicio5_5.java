import javax.swing.JOptionPane;

public class Exercicio5_5 {
	
	public static void main(String args[]){
		
		// Lendo o código de um produto, sua quantidade e apresentando o valor total a pagar.
		
		int codigoItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o código do item:"));
		
		int qtdeItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de itens:"));
		
		double total = 0;
		switch (codigoItem) {
		case 1:
			total = qtdeItem * 4.00;
			break;

		case 2:
			total = qtdeItem * 4.50;
			break;
			
		case 3:
			total = qtdeItem * 5.00;
			break;
			
		case 4:
			total = qtdeItem * 2.00;
			break;
	
		case 5:
			total = qtdeItem * 1.50;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Código Inválido.");
			break;
		}
		
		JOptionPane.showMessageDialog(null, String.format("Total a pagar: %.2f", total));
		
	}
	
}