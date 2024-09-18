import javax.swing.JOptionPane;

public class Exercicio8_5 {

	public static void main(String[] args) {
		// Ler dois n�meros por par�metro e exibir a soma dos N n�meros que est�o entre eles.
		
		String n1 = JOptionPane.showInputDialog("Insira um n�mero:");
		String n2 = JOptionPane.showInputDialog("Insira outro n�mero:");
		JOptionPane.showMessageDialog(null, "A soma dos n�meros do intervalo �: " + somarIntervalo(n1, n2));
	}	
	
	public static int somarIntervalo(String n1, String n2){
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int soma = 0;
		
		if (num1 < num2) {			
			for (int i = (num1 + 1); i < num2; i++){
				soma = soma + i;
			}
		} else if (num1 > num2) {
			for (int i = (num2 + 1); i < num1; i++) {
				soma = soma + i;
			}
		}
		
		return soma;
		
	}
}
