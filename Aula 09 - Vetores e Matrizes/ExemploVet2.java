
public class ExemploVet2 {
	
	public static void main(String args[]){
		
		String[] nomes = {"Jos�", "Alessandra", "Alan", "Yasmin"};
		
		

		System.out.println("Nomes do vetor: ");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome no �ndice " + i + ": " + nomes[i]);
		}
		
		System.out.println("");
		
		// Alterando um valor no vetor
		nomes[2] = "Alan de Oliveira";
		
		System.out.println("---------------------");
		System.out.println("NOMES AP�S ALTERA��O:");
		System.out.println("---------------------");

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome no �ndice " + i + ": " + nomes[i]);
		}
	}
}
