
public class Aula05CondicaoSWITCH {


	public static void main(String[] args) {
		
		int diaDaSemana = 3; // Padrão camelCase
		String nome_user = "Alan"; // Padrão snake_case
			
	    switch (diaDaSemana) {
		case 1:
			System.out.println("Olá " + nome_user + "! Hoje é Domingo");
			break;
			
        case 2:
        	System.out.println("Olá " + nome_user + "! Hoje é Segunda");
			break;
			
        case 3:
        	System.out.println("Olá " + nome_user + "! Hoje é Terça");
	        break;
	        
        case 4:
        	System.out.println("Olá " + nome_user + "! Hoje é Quarta");
			break;
			
        case 5:
        	System.out.println("Olá " + nome_user + "! Hoje é Quinta");
			break;
			
        case 6:
        	System.out.println("Olá " + nome_user + "! Hoje é Sexta");
	        break;
	        
        case 7:
        	System.out.println("Olá " + nome_user + "! Hoje é Sábado");
        	break;
        	
		default:
			System.out.println("Olá " + nome_user + "! Dia Inválido");
			break;
		}

	}

}
