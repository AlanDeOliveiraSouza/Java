import javax.swing.JOptionPane;



public class Exercicio_02 {

	public static void main(String[] args) {
		
		double pi = 3.14159;
		
		float raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do raio de um c�rculo:"));
		
		double area = pi * Math.pow(raio, 2);
		
		JOptionPane.showMessageDialog(null, String.format("�rea do circulo = %.4f", area));
		
		
	}

}
