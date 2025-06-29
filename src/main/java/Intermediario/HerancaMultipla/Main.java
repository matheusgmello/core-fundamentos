package Intermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Renegado de merda";
        sasuke.idade = 18;
        sasuke.shariganAtivado();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Konoha", 31);
        kakashi.boasVindas();
        kakashi.shariganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();
    }
}
