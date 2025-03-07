package Intermediario;

public class Main {
    public static void main(String[] args) {

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.aldeia = "Konoha";

        // Aplicando um método ao o objeto
        Sasuke.ShariganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmninja();
        System.out.println(chamandoMetodo);

        int quatoTempoFalta = Sasuke.anosParaSeTornarHokage(25);
        System.out.println("Você tem: " + Sasuke.idade + " Faltam no mínimo: " + quatoTempoFalta + " anos para se tornar Hokage");

        System.out.println("Nome: " + Sasuke.nome);
        System.out.println("Idade: " + Sasuke.idade);
        System.out.println("Aldeia: " + Sasuke.aldeia);

    }
}
