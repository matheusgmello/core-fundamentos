package Iniciante.Dados;

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

        // Redeclarar Array
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        // For para fazer um LOOP no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }


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

    }
}
