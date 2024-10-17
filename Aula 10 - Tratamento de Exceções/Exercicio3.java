public class Exercicio3 {
	
	public static void main(String args[]){
		// Criar um programa que declare um Array de inteiros com tamanho fixo e tente acessar um valor fora dos limites do Array.
		// Trate a exceção.
		
		int[] vetor = {12, 58, 27, 22, 87, 43, 76};
		
		System.out.println("||VETOR||");
		for (int i = 0; i < vetor.length; i++) {
			if(i == (vetor.length - 1)){
				System.out.println(vetor[i] + ". \n");
			} else{
				System.out.print(vetor[i] + ", ");
			}
		}
		
		try{
			
			System.out.println(vetor[10]);
			
		}catch(ArrayIndexOutOfBoundsException a){
			
			System.out.println("Posição não existe no vetor!!\n");
			
		}finally{
			
			System.out.println("Código finalizado!");
			
		}
	}
}
