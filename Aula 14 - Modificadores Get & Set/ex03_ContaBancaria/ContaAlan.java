package ex03_ContaBancaria;

import java.util.Scanner;

public class ContaAlan {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		ContaBancaria contaAlan = new ContaBancaria();
		
		// Titular da conta:
		contaAlan.setTitular("Alan");
		System.out.println("Titular da conta: " + contaAlan.getTitular() + "\n");
		
		// Valor atual na conta:
		contaAlan.setSaldo(150.25);
		System.out.println("Saldo atual da conta: " + contaAlan.getSaldo() + "\n");
		
		// Depositando um valor:
		System.out.println("Insira quanto deseja depositar em conta:");
		System.out.println(contaAlan.realizarDeposito(leitor.nextDouble()) + "\n");
		
		// Sacando um valor:
		// Inserindo um valor inválido para teste
		// Caso o valor seja inválido a operação não será realizada
		System.out.println("Digite o valor que deseja sacar de sua conta:");
		System.out.println(contaAlan.realizarSaque(leitor.nextDouble()) + "\n");
		
		// Agora utilizando um valor válido
		System.out.println("Tente novamente:");
		System.out.println(contaAlan.realizarSaque(leitor.nextDouble()));
		
	}

}
