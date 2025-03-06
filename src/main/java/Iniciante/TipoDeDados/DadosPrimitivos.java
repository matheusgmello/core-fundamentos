package Iniciante.TipoDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja - Naruto -
        * */

        int idade = 16; // Valor maximo de 2 147 483 647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 9999999L; // Valor maximo de 9.223.372.036.854.775.807

        System.out.println(idade); // Comando para mostrar para o usuário
        System.out.println("saldoBancario do naruto é = " + saldoBancario);
        System.out.println("Naruto tá vivo ou morto= " + vivoOuMorto);
        System.out.println("Altura desse coco é  = " + altura);
        System.out.println("inicial dele é = " + inicial);
    }
}
