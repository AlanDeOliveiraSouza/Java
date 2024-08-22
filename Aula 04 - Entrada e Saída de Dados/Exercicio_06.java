import javax.swing.JOptionPane;


public class Exercicio_06 {

	public static void main(String[] args) {
		
		double valorA = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor A: "));
		
		double valorB = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor B: "));
		
		double valorC = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor C: "));
		
		
		double trianguloA = (valorA * valorC)/2;
		
		double circuloA = 3.14159 * Math.pow(valorC, 2);
		
		double trapezioA = ((valorA * valorB)* valorC)/2;
		
		double quadradoA = valorB * valorB;
		
		double retanguloA = valorA * valorB;
		
		String resultado1 = String.format("%.3f", trianguloA);
		
		String resultado2 = String.format("%.3f", circuloA);
		
		String resultado3 = String.format("%.3f", trapezioA);
		
		String resultado4 = String.format("%.3f", quadradoA);
		
		String resultado5 = String.format("%.3f", retanguloA);
		
		JOptionPane.showMessageDialog(null, "Triângulo = " + resultado1 + "\n" + "Círculo = " + resultado2 + "\n" + "Trapezio = " + resultado3 + "\n" + "Quadrado = " + resultado4 + "\n" + "Retângulo = " + resultado5);
		
		
	}

}
