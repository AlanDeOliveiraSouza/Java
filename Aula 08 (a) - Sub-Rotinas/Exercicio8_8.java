import javax.swing.JOptionPane;

public class Exercicio8_8 {
  public static void main(String args[]) {
    // Receber 3 notas e calcular o tipo de média de acordo com a escolha do usuário - (A - Média Aritmética; P - Média Ponderada)
    float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a primeira nota:"));
    float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a segunda nota:"));
    float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Insira a terceira nota:"));
    String tipoMedia = JOptionPane
        .showInputDialog("Insira o tipo de média a ser calculada(A - Média Aritmética; P - Média Ponderada):");
    JOptionPane.showMessageDialog(null, calcularMedia(nota1, nota2, nota3, tipoMedia));
  }

  public static float calcularMedia(float n1, float n2, float n3, String tipo){
    float mediaFinal = 0;
    switch (tipo) {
      case "A":
        mediaFinal = (n1 + n2 + n3) / 3;
        break;
      case "P":
        mediaFinal = (n1 / 2) + ((n2 / 10) * 3) + (n3 / 5);
        break;
      default:
        JOptionPane.showMessageDialog(null, "Tipo de média inválido!");
        break;
    }
    return mediaFinal;
  }
}