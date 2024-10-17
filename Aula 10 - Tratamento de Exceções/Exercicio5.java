public class Exercicio5 {
	
	public static void main(String args[]){
		// Criar um programa que tente acessar um método ou atributo de objeto que é nulo.
		// Trate a exceção do ponteiro nulo (NullPointerException).

		System.out.println("Início do código\n");
		
		// Utilizando um método que dará um valor null ao vetor.
		String[] vetor = criarVetor();
		
		int num = 20;
		
		try{
			
			System.out.println("Divisão do numero " + num + " pelo tamanho do vetor:");
			int dividido = num / vetor.length;
			System.out.println(dividido);
			
		}catch(NullPointerException a){
			
			System.out.println("O vetor não pode ser divisor pois não tem valor definido!!\n");
			
		}finally{
			
			System.out.println("Fim do código");
			
		}
	}
	
	public static String[] criarVetor(){
		
		String[] vetor = null;
		
		return vetor;
	}
}
