public class Exemplo1 {

	public static void main(String[] args) {

		try{
			
			//int resultado = 10 / 0;
			
			int[] numeros = {1, 2, 3};
			int resultado = numeros[3] / 0;
			
		}catch (ArrayIndexOutOfBoundsException e2){
			
			System.out.println("Índice de Array inválido!!\n");
			
		}catch (ArithmeticException e1){

			System.out.println("Erro!! Divisão por zero não permitida!\n");
			
		}finally{
			
			System.out.println("Execução do bloco finally!\n");
			
		}
		
		System.out.println("Execução do programa continua...");
		
	}

}
