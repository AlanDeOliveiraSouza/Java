import java.util.Scanner;


public class cls_ExemploEntradaSaida_SC {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome: ");
		
		String nome = leitor.nextLine();
		
		System.out.println("Olá, " + nome + "!!!");
		
		leitor.close();
		
	}

}
