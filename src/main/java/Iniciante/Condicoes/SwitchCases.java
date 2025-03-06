package Iniciante.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: Que servem para gerar casos específicos.
        * Objetivo: Pedir pro usuário escolher entre os Ninjas
        * switchCase
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);


        // Mostrar opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher um personagem
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o numero: " + escolhaDoUsuario);

        // Reacao ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Personagem não encontrado, tente novamente");
                break;
        }


        // Fechar a caixa
        scanner.close();

    }
}
