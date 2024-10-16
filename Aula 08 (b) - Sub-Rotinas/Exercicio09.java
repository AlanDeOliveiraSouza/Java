import java.util.Scanner;
import java.util.Arrays;

public class Exercicio09 {
    public static void main(String args[]) {
	// Criar um programa com uma sub-rotina que leia e organize os numeros informados pelo usuário em ordem crescente.
		
	Scanner leitura = new Scanner(System.in);
	System.out.println("Informe quantos números serão digitados:");
	int qtde = leitura.nextInt();
	double numeros[] =  new double[qtde];
	for(int i = 0; i < qtde; i++){
	    System.out.println("Digite o " + (i + 1) + "° número:");
	    numeros[i] = leitura.nextDouble();
	}
	organizarArray(numeros);
	System.out.print("Números organizados: ");
	for(int i = 0; i < qtde; i++){
            if (i == qtde - 1) {
		System.out.print(numeros[i] + ".");
	    } else {
	        System.out.print(numeros[i] + ", ");
	    }
	}

	leitura.close();
    }

    public static void organizarArray(double[] array) {
	Arrays.sort(array);
    }
}