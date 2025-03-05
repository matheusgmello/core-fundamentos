package Dados;

public class Array {
    public static void main(String[] args) {


        // Arrays são tipo referencia
        // String inicializa como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";
        ninja[4] = "Kakashi";
        System.out.println(ninja[5]);

        // Array idade -> inicializa como 0
        int[] idade = new int[2];
        idade[0] = 16;
        idade[1] = 17;
        System.out.println(idade[0]);

        // Array boolean -> inicia como false
        boolean[] verdadeiroOuFalso = new boolean[2];
        verdadeiroOuFalso[0] = true;
        System.out.println(verdadeiroOuFalso[1]);

        // Array double -> inicia como 0.0
        double[] flutuante = new double[2];
        flutuante[0] = 1.5;
        System.out.println(flutuante[1]);


        String nomeDoNinja1 = "Gustavo do deserto";
        String nomeDoNinja2 = "Roberto lee";
    }
}
