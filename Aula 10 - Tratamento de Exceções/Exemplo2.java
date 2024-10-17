public class Exemplo2 {

	public static void main(String[] args) {

		try{
			
			validarIdade(16);
			
		}catch(IllegalArgumentException e){
			
			System.out.println("Erro: " + e.getMessage());
			
		}
		
	}

	public static void validarIdade(int idade){
		if (idade < 18){
			throw new IllegalArgumentException("Idade deve ser maior ou igual a 18!!");
		}
	}
	
}
