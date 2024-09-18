public class Exemplo1 {

	public static void main(String[] args) {
		saudacao(); // Chamada da Sub-Rotina
		
		saudacaoPersonalizada("Alan");
		
		int resultado = somar(10, 20);
		System.out.println("O resultado da soma é: " + resultado);
		
		int numeroAleatorio = gerarNumeroAleatorio();
		System.out.println("Número aleatório gerado: " + numeroAleatorio);
		
		double media = calcularMedia(8.5, 8.0, 7.5);
		System.out.println("A média é: " + media);
	}
	
	public static double calcularMedia(double n1, double n2, double n3) {
		
		return (n1 + n2 + n3) / 3;
	}
	
	public static int gerarNumeroAleatorio() {
		return (int) (Math.random()* 100);
	}

	public static void saudacao() {
		
		System.out.println("Exemplo de Sub-Rotina!");
	}
	
	public static void saudacaoPersonalizada(String nome) {
		
		System.out.println("Olá " + nome + "! Seja muito bem-vindo a um programa que só faz isso!!!");
	}
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
	// Os procedimentos não precisam estar necessáriamente na ordem em que serão chamados no código.
}
