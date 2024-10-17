public class Exercicio5 {
	
	public static void main(String args[]){
		// Criar um programa que tente acessar um m�todo ou atributo de objeto que � nulo.
		// Trate a exce��o do ponteiro nulo (NullPointerException).

		System.out.println("In�cio do c�digo\n");
		
		// Utilizando um m�todo que dar� um valor null ao vetor.
		String[] vetor = criarVetor();
		
		int num = 20;
		
		try{
			
			System.out.println("Divis�o do numero " + num + " pelo tamanho do vetor:");
			int dividido = num / vetor.length;
			System.out.println(dividido);
			
		}catch(NullPointerException a){
			
			System.out.println("O vetor n�o pode ser divisor pois n�o tem valor definido!!\n");
			
		}finally{
			
			System.out.println("Fim do c�digo");
			
		}
	}
	
	public static String[] criarVetor(){
		
		String[] vetor = null;
		
		return vetor;
	}
}
