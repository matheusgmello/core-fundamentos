package Iniciante.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {

        /*
         * Scanner = É um jeito de trazer o usuario para dentro da aplicação
         * Objetivo: O usuario vai criar um ninja e vamos validar os dados
         * */

        // Abre o scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Recebe o nome do ninja
        System.out.println("Escolha o nome do ninja🥷: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: "+ nomeDoNinja + "🥷");

        // Receber a idade do ninja
        System.out.println("Escolha a idade do ninja🥷: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja "+ nomeDoNinja + " é: "+ idadeDoNinja + " Anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18){
            System.out.println("O ninja "+ nomeDoNinja + " é maior de idade e pode ir para missoes fora da aldeia");
        } else {
            System.out.println("O ninja "+ nomeDoNinja + " é menor de idade e esse ninja não pode ir para missoes fora da aldeia");
        }

        // Fechar sempre o scanner ☝️🤓
        caixaDeTexto.close();

    }

}
