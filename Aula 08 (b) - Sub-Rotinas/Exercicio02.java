import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Receber um número inteiro. Se for par, imprimir True, se for ímpar, imprimir False.
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro(Caso ele seja positivo será exibido 'True', e caso ele seja negativo será exibido 'False').");
		int num = leitura.nextInt();
		System.out.println(identificar(num));
		
		leitura.close();
	}
	
	public static String identificar(int n1) {
		String resp;
		if (n1 % 2 == 0){
			resp = "True";
		} else {
			resp = "False";
		}
		
		return resp;
	}
}
