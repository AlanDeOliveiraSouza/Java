public class Exercicio3_4 {
    public static void main(String args[]){

        // Declarando vari�veis com todos os tipos primitivos e utilizando v�rios operadores.

        // CHAR
        char letra1 = 'A';
        char letra2 = 'Z';
        System.out.println("O alfabeto vai de " + letra1 + " a " + letra2 + ".");
        System.out.println("D medio = " + letra1 + letra2 + "21.");
        // D = nota musical R�.
        System.out.println("\n");
    
        // BYTE
        byte num_a = 25;
        byte num_b = -110;
        int num_c = num_a + num_b;
        System.out.println("O primeiro n�mero �: " + num_a + ". O segundo n�mero �: " + num_b + ". Total da soma: " + num_c);
        System.out.println("\n");

        // SHORT
        short casa1 = 21700;
        short casa2 = 31128;
        int sResult = casa2 - casa1;
        System.out.println("O n�mero da primeira casa �: " + casa1 + ". O n�mero da segunda casa �: " + casa2 + ".");
        System.out.println("A diferen�a de valor das casas �: " + sResult);
        System.out.println("\n");
        
        // INT
        int imovel1 = 490000;
        int imovel2 = 422000;
        int iResult = imovel1 - imovel2;
        System.out.println("O valor do 1� im�vel �: " + imovel1 + ". O valor do 2� im�vel �: " + imovel2);
        System.out.println("A diferen�a de valor destes 2 im�veis �: " + iResult);
        System.out.println("\n");

        // LONG
        long adult = 37;
        long child = 17;
        long lResult = adult - child;
        System.out.println("O corpo de uma crian�a de 10 anos tem aproximadamente " + child + " trilh�es de c�lulas.");
        System.out.println("J� o corpo de um homem adulto tem cerca de " + adult + " trilh�es de c�lulas.");
        System.out.println("Uma incr�vel diferen�a de " + lResult + " trilh�es");
        System.out.println("\n");

       // FLOAT
       float a = 17.75f;
       float b = 21.14f;
       float fResult = a*b;
       System.out.println("a = " + a + "\nb = " + b + "\na X b = " + fResult);
       System.out.println("\n");

        // DOUBLE
       double c = 137.75d;
       double d = 212.14d;
       double dResult = d/c;
       System.out.println("c = " + c + "\nd = " + d + "\nd / c = " + dResult);
       System.out.println("\n");
    }
}