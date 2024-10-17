import javax.swing.JOptionPane;


public class Ex05 {
	public static void main(String args[]){
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular seu fatorial:"));
		JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é: " + calcularFatorial(num));
		
	}
	
	public static int calcularFatorial(int fat){
		
		int fatorial = fat;
		for(int i = fat - 1; i >= 1; i--){
			fatorial *= i;
		}
		
		return fatorial;
	}
}
