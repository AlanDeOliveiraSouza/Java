package exemplo;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		// Usando os setters para definir valores
		pessoa.setNome("Alan");
		pessoa.setIdade(18);
		
		// Usando os getters para acessar os valores
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());

	}

}
