public class Exercicio3_4 {
    public static void main(String args[]){

        // Declarando variáveis com todos os tipos primitivos e utilizando vários operadores.

        // CHAR
        char letra1 = 'A';
        char letra2 = 'Z';
        System.out.println("O alfabeto vai de " + letra1 + " a " + letra2 + ".");
        System.out.println("D medio = " + letra1 + letra2 + "21.");
        // D = nota musical Ré.
        System.out.println("\n");
    
        // BYTE
        byte num_a = 25;
        byte num_b = -110;
        int num_c = num_a + num_b;
        System.out.println("O primeiro número é: " + num_a + ". O segundo número é: " + num_b + ". Total da soma: " + num_c);
        System.out.println("\n");

        // SHORT
        short casa1 = 21700;
        short casa2 = 31128;
        int sResult = casa2 - casa1;
        System.out.println("O número da primeira casa é: " + casa1 + ". O número da segunda casa é: " + casa2 + ".");
        System.out.println("A diferença de valor das casas é: " + sResult);
        System.out.println("\n");
        
        // INT
        int imovel1 = 490000;
        int imovel2 = 422000;
        int iResult = imovel1 - imovel2;
        System.out.println("O valor do 1° imóvel é: " + imovel1 + ". O valor do 2° imóvel é: " + imovel2);
        System.out.println("A diferença de valor destes 2 imóveis é: " + iResult);
        System.out.println("\n");

        // LONG
        long adult = 37;
        long child = 17;
        long lResult = adult - child;
        System.out.println("O corpo de uma criança de 10 anos tem aproximadamente " + child + " trilhões de células.");
        System.out.println("Já o corpo de um homem adulto tem cerca de " + adult + " trilhões de células.");
        System.out.println("Uma incrível diferença de " + lResult + " trilhões");
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