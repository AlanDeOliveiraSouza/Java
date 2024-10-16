import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		// Leia um vetor de N valores inteiros e mostre o maior n�mero (desconsiderando empates) e sua posi��o (come�ando da posi��o 0).

		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos n�meros ser�o inseridos:"));
		double[] vetor = new double[qtde];
		
		double maior = 0;
		int posicao = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� n�mero:"));
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O maior n�mero do vetor �: " + maior);
		JOptionPane.showMessageDialog(null, "Sua posi��o �: " + posicao);
	}
}
