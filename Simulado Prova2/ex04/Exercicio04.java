package ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira quantos números você irá digitar: ");
		int qtde = leitor.nextInt();
		int[] lista = new int[qtde];
		int erroCont = 0;
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			lista[i] = leitor.nextInt();
			if (i > 0){
				if (lista[i] < lista[i-1]) {
					erroCont++;
				}
			}
		}
		if (erroCont > 0){
			System.out.println("A lista não está em ordem crescente!!");
			organizarLista(lista);
			mostrarLista(lista);
		} else {
			System.out.println("A lista já está em ordem crescente!!");
			mostrarLista(lista);
		}
	}
	
	public static void mostrarLista(int[] lista){
		
		System.out.println("\nLISTA ORDENADA");
		for (int i = 0; i < lista.length; i++) {
			if(i == (lista.length -1)){
				System.out.print(lista[i] + ".");
			} else {
				System.out.print(lista[i] + ", ");
			}
		}
		
	}
	public static int[] organizarLista(int[] lista){
		Arrays.sort(lista);
		return lista;
	}
}