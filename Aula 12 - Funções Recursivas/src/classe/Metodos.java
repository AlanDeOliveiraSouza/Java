package classe;

public class Metodos {
	// Métodos utilizados na atividade envolvendo funções recursivas, contendo 6 exercícios.
	
	public int numero; // Usado no itens 1, 2, 3, 4 e 6.
	
	// 6 - Somar Dígitos
	public static int somarDigitos(int numero, int soma){

	  if(numero < 1){
	    return soma;
	  } else {
	    soma += numero % 10;
	    return somarDigitos((numero / 10), soma);
	  }
	    
	}
	
	// 5 - Inverter String
	public String texto;
	public static String inverterString(String texto, int tamanho){
		if (tamanho == 0) {
			return Character.toString(texto.charAt(0));
		} else if (Character.isLetter(texto.charAt(tamanho))){
			// Verificar se é uma letra
			return Character.toString(texto.charAt(tamanho)) + inverterString(texto, (tamanho - 1));
		} else {
			return inverterString(texto, (tamanho - 1));
		}
	}
	
	// 4 - Potência
	public int expoente;
	
	public static int calcularPotencia(int numero, int expoente){
	
	  if (expoente == 0) {
	    return 1;
	  } else {
	    return numero * calcularPotencia(numero, expoente - 1);
	  }
	    
	}
	
	// 3 - Fibonacci
	public static int fn1 = 0;
	public static int fn2 = 1;
	public static int cont;

	public static int numerosFibonacci(int numero){
		
		if (numero == 0) {
			return 0;
		} else if (numero == 1) {
			return fn2;
		} else {
			cont = fn1 + fn2;
			fn1 = fn2;
			fn2 = cont;
			return numerosFibonacci(numero - 1);
		}
		
	}
	
	// 2 - Soma dos Naturais
	public static int somaNaturais(int numero){
		
		if (numero == 1) {
			return 1;
		} else {
			return numero + somaNaturais(numero - 1);
		}
	}
	
	// 1 - Fatorial
	public static int calcFatorial(int numero){
		
		if (numero == 1){
			return 1;
		} else {
			return numero * calcFatorial(numero - 1);
		}
		
	}

}
