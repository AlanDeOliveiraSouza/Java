import javax.swing.JOptionPane;

public class Exercicio06 {
  public static void main(String[] args) {
    // Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
    // Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.

    int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas:"));
    double[] alturas = new double[qtde];
    char[] genero = new char[qtde];

    double maior = 0;
    double menor = 100;
    double alturaM = 0;
    int homens = 0;
    int mulher = 0;
    String reader = "ab";

    for (int i = 0; i < qtde; i++) {
      alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura desta pessoa: "));
      while (reader.length() != 1 ){
        reader = (JOptionPane.showInputDialog("Insira o gênero desta pessoa (digite M ou F): "));
        if (reader == null) {
          JOptionPane.showMessageDialog(null, "Resposta inválida!");
        } else if (reader.length() != 1) {
          JOptionPane.showMessageDialog(null, "Resposta inválida!");
        } else {
          genero[i] = reader.charAt(0);
        }
      } 
      if (alturas[i] > maior) {
        maior = alturas[i];
      }
      if (alturas[i] < menor) {
        menor = alturas[i];
      }
      if (genero[i] == 'F') {
        alturaM += alturas[i];
        mulher++;
      }
      if (genero[i] == 'M'){
        homens++;
      }
      reader = "ab";
    }
    double media = alturaM / mulher;

    JOptionPane.showMessageDialog(null, "Maior altura: " + maior + ". Menor altura: " + menor);
    JOptionPane.showMessageDialog(null, "Média altura das mulheres: " + String.format("%.2f", media));
    JOptionPane.showMessageDialog(null, "Quantidade de homens: " + homens);
  }
}