package Iniciante.Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
         * IF e ELSE - Condicoes
         * else if -
         * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
         * */

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;


        //se(condicao) {faca isso}
        if(numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounnin");
        }
        else {
            System.out.println("Rank: Gennim");
        }
    }
}
