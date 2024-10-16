import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		// Informe o nome e as notas do 1º e 2º semestre de N alunos, depois exiba quais foram aprovados.

		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
		String[] nomes = new String[qtde];
		float[] sem1 = new float[qtde];
		float[] sem2 = new float[qtde];
		
		String aprovado = "APROVADOS: ";
		int alunosAp = 0;
		
		for (int i = 0; i < qtde; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º aluno(a):");
			sem1[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do 1º Semestre do aluno(a) " + nomes[i]));
			sem2[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do 2º Semestre do aluno(a) " + nomes[i]));
			if ((sem1[i] + sem2[i]) / 2 >= 6) {
				alunosAp++;
			}
		}
		
		int alunos = 0;
		for (int i = 0; i < qtde; i++) {
			if ((sem1[i] + sem2[i]) / 2 >= 6) {
				alunos++;
				if (alunos == alunosAp) {
					aprovado += nomes[i] + ". ";
				} else {
					aprovado += nomes[i] + " - ";
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, aprovado);
		
	}
}
