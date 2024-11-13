import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		// Escreva um programa que exclui um arquivo em um diretório especificado.
		
		JFileChooser seletor = new JFileChooser();
		
		JOptionPane.showMessageDialog(null, "Selecione o arquivo que deseja excluir");
		
		int saida = seletor.showOpenDialog(null);
		if(saida == JFileChooser.APPROVE_OPTION) {
			
			File local = seletor.getSelectedFile();
			boolean apagado = local.delete();
			
			if(apagado) {
				JOptionPane.showMessageDialog(null, "Arquivo excluído com sucesso!!");
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possível excluir o arquivo.");
			}
				
		}
	}
}
