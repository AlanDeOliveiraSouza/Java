import javax.swing.JOptionPane;


public class Ex07 {
	public static void main(String args[]){
		
		JOptionPane.showMessageDialog(null, "Descubra aqui a soma de todos os números pares de 1 a 100!!");
		int soma = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				soma += i;
			}
		}
		JOptionPane.showMessageDialog(null, "A soma dos números pares de 1 a 100 é: " + soma);
	}
}
 