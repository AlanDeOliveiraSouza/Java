class IdadeInvalidaException extends Exception {
	// construtor que recebe a mensagem
	public IdadeInvalidaException(String mensagem){
		super(mensagem);
	}
}

public class Exemplo3 {
	
	public static void validarIdade(int idade) throws IdadeInvalidaException{
		if (idade < 18 || idade > 100){
			throw new IdadeInvalidaException("Idade deve estar entre 18 e 100 anos!!");
		} else {
			System.out.println("Idade válida: " + idade);
		}
	}

	public static void main(String[] args) {

		try{
			
			validarIdade(21); // Induzindo um erro
			
		}catch(IdadeInvalidaException e){
			
			System.out.println("Erro: " + e.getMessage());
			
		}
		
	}
	
}
