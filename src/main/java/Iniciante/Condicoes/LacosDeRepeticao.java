package Iniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição: vao repetir infinitamente ou até que uma condição seja atendida
        * WHILE - For
        * */

        // WHILE
        // WHILE - (condicao) {Tudo auqi vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 10;

//        while (numeroDeClones <= numeroMaximoDeClones){
//            numeroDeClones++;
//            System.out.println("O naruto fez um clone das - " + numeroDeClones);
//        }

        // FOR

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto está louco e esta se clonando - " + i);
        }

    }


}
