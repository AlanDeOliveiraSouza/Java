public class Exercicio3_7 {
    public static void main(String args[]){

        // Calculando e determinando se o ano atual é ou não bissexto.
        int ano = 2024;
        boolean bissexto = ano % 4 == 0;
        System.out.println("Se o resultado for 'true' o ano é bissexto, caso seja 'false', o ano não é bissexto.");
        System.out.println(ano + " = " + bissexto);
    }
}