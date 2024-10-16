import java.util.Scanner;

public class Exercicio10 {
  public static void main(String args[]) {
    // Criar um programa com uma sub-rotina que receba um número N e informe os divisores de N.

    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite o número do qual deseja identificar os divisores:");
    int numero = leitura.nextInt();
    System.out.println(buscarDivisores(numero));

    leitura.close();
  }

  public static String buscarDivisores(int num) {
    String resposta = "Divisores de " + num + " :";
    for (int i = 1; i <= num; i++) {
      if (num % i == 0 && i == 1){
        resposta += " " + i;
      } else if (num % i == 0 && i != num) {
        resposta += ", " + i;
      } else if (num % i == 0 && i == num) {
        resposta += ", " + i + ".";
      }
    }
    return resposta;
  }
}