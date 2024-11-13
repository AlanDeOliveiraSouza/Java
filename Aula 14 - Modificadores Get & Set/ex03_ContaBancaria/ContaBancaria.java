package ex03_ContaBancaria;

public class ContaBancaria {
	/*
	  Crie uma classe ContaBancaria com atributos privados
	  saldo (double) e titular (String). Forneça métodos GET e SET
	  para ambos os atributos. Adicione um método realizarDeposito
	  que recebe um valor e adiciona ao saldo. Adicione um método
	  realizarSaque que recebe um valor e subtrai do saldo, verificando
	  se há saldo suficiente. Crie uma instância da classe, realize
	  algumas operações e exiba o saldo final. 
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
		return "Depósito realizado com sucesso!!\nSaldo atual: " + this.saldo;
	}
	
	public String realizarSaque(double valor){
		if(valor > this.saldo){
			return "Valor inválido!";
		} else{
			this.saldo -= valor;
			return "Saque realizado com sucesso!!\nSaldo atual: " + this.saldo;
		}
	}
	// Utilizei a saída das operações (Deposito e Saque) em String para
	// exibir uma mensagem de conclusão ou erro de acordo com o resultado.
}
