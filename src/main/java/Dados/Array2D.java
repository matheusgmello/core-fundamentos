package Dados;

public class Array2D {
    public static void main(String[] args) {

        /*
        * Array 2D
        *
        * */

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzakraki";
        ninjasEAldeias[0][2] = "Sasuke MinhaTia";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku da o cu";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara da o cu certo";
        ninjasEAldeias[2][2] = "Temari inutil";


        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][0]);
        }

    }
}
