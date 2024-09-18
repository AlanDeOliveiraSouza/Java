import javax.swing.JOptionPane;

public class Exercicio8_5 {

	public static void main(String[] args) {
		// Ler dois números por parâmetro e exibir a soma dos N números que estão entre eles.
		
		String n1 = JOptionPane.showInputDialog("Insira um número:");
		String n2 = JOptionPane.showInputDialog("Insira outro número:");
		JOptionPane.showMessageDialog(null, "A soma dos números do intervalo é: " + somarIntervalo(n1, n2));
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
