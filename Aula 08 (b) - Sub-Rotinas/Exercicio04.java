import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		// Receber o nome do usu�rio e apresentar uma sauda��o personalizada.
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero:"));
		
		int resposta = maiorNumero(num1, num2);
		if (num1 == num2){
			JOptionPane.showMessageDialog(null, "Os dois n�meros s�o iguais.");
		} else {
			JOptionPane.showMessageDialog(null, resposta + " � o maior n�mero.");
		}		
	}
	
	public static int maiorNumero(int n1, int n2) {
		int numero;
		
		if(n1 > n2){
			numero = n1;
		} else if(n2 > n1){
			numero = n2;
		} else {
			numero = 0;
		}
		
		return numero;
	}
}
