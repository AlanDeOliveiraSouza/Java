
public class Aula05CondicaoSWITCH {


	public static void main(String[] args) {
		
		int diaDaSemana = 3; // Padr�o camelCase
		String nome_user = "Alan"; // Padr�o snake_case
			
	    switch (diaDaSemana) {
		case 1:
			System.out.println("Ol� " + nome_user + "! Hoje � Domingo");
			break;
			
        case 2:
        	System.out.println("Ol� " + nome_user + "! Hoje � Segunda");
			break;
			
        case 3:
        	System.out.println("Ol� " + nome_user + "! Hoje � Ter�a");
	        break;
	        
        case 4:
        	System.out.println("Ol� " + nome_user + "! Hoje � Quarta");
			break;
			
        case 5:
        	System.out.println("Ol� " + nome_user + "! Hoje � Quinta");
			break;
			
        case 6:
        	System.out.println("Ol� " + nome_user + "! Hoje � Sexta");
	        break;
	        
        case 7:
        	System.out.println("Ol� " + nome_user + "! Hoje � S�bado");
        	break;
        	
		default:
			System.out.println("Ol� " + nome_user + "! Dia Inv�lido");
			break;
		}

	}

}
