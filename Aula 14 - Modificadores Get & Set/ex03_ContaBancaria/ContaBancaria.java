package ex03_ContaBancaria;

public class ContaBancaria {
	/*
	  Crie uma classe ContaBancaria com atributos privados
	  saldo (double) e titular (String). Forne�a m�todos GET e SET
	  para ambos os atributos. Adicione um m�todo realizarDeposito
	  que recebe um valor e adiciona ao saldo. Adicione um m�todo
	  realizarSaque que recebe um valor e subtrai do saldo, verificando
	  se h� saldo suficiente. Crie uma inst�ncia da classe, realize
	  algumas opera��es e exiba o saldo final. 
	*/

	private double saldo;
	private String titular;
	
	public double getSaldo(){
		return this.saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public String getTitular(){
		return this.titular;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public String realizarDeposito(double valor){
		this.saldo += valor;
		return "Dep�sito realizado com sucesso!!\nSaldo atual: " + this.saldo;
	}
	
	public String realizarSaque(double valor){
		if(valor > this.saldo){
			return "Valor inv�lido!";
		} else{
			this.saldo -= valor;
			return "Saque realizado com sucesso!!\nSaldo atual: " + this.saldo;
		}
	}
	// Utilizei a sa�da das opera��es (Deposito e Saque) em String para
	// exibir uma mensagem de conclus�o ou erro de acordo com o resultado.
}
