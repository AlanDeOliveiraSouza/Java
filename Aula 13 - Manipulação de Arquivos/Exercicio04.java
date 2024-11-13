import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		// Escreva um programa que renomeia um arquivo em um diretório especificado.
		
		JFileChooser seletor = new JFileChooser();
		
		JOptionPane.showMessageDialog(null, "Selecione o arquivo a ser renomeado");
		
		int resposta = seletor.showOpenDialog(null);
		
		if(resposta == JFileChooser.APPROVE_OPTION){
			File arquivo = seletor.getSelectedFile();
			JOptionPane.showMessageDialog(null, "Local do arquivo: " + arquivo.getParent());
			String novoNome = JOptionPane.showInputDialog("Digite o novo nome do arquivo (inclua a extensão do arquivo)");
			File arqRenomeado = new File(arquivo.getParent(), novoNome);
			boolean pronto = arquivo.renameTo(arqRenomeado);
			
			if(pronto){
				JOptionPane.showMessageDialog(null, "Arquivo renomeado com sucesso!!!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Operação cancelada!");
		}

	}

}
