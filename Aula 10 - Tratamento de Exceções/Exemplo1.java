public class Exemplo1 {

	public static void main(String[] args) {

		try{
			
			//int resultado = 10 / 0;
			
			int[] numeros = {1, 2, 3};
			int resultado = numeros[3] / 0;
			
		}catch (ArrayIndexOutOfBoundsException e2){
			
			System.out.println("�ndice de Array inv�lido!!\n");
			
		}catch (ArithmeticException e1){

			System.out.println("Erro!! Divis�o por zero n�o permitida!\n");
			
		}finally{
			
			System.out.println("Execu��o do bloco finally!\n");
			
		}
		
		System.out.println("Execu��o do programa continua...");
		
	}

}
