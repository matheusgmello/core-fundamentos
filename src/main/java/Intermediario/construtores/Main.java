package Intermediario.construtores;

public class Main {
    public static void main(String[] args) {

        Hogakes Hashirama = new Hogakes("Jorge");
        Hashirama.idade = 45;

        Hogakes Tobirama = new Hogakes("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hogakes Hiruzen = new Hogakes(77);
        System.out.println(Hiruzen.idade);

        Hogakes Minato = new Hogakes("Minato", 24, true);
        System.out.println(Minato.nome + " " + Minato.idade + " " + Minato.vivoOuNao);


    }
}
