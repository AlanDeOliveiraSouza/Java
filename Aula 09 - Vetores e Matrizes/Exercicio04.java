import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		// Leia um vetor de N valores inteiros e mostre o maior número (desconsiderando empates) e sua posição (começando da posição 0).

		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos números serão inseridos:"));
		double[] vetor = new double[qtde];
		
		double maior = 0;
		int posicao = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O maior número do vetor é: " + maior);
		JOptionPane.showMessageDialog(null, "Sua posição é: " + posicao);
	}
}
