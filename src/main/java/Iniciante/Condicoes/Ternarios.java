package Iniciante.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: São maneiras de reduzir o codigo
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 18;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" :
                "Esse ninja esta com menos de 10 missoes";

        System.out.println(nivelDoNinja);


    }

}
