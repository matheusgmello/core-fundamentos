package Intermediario;

public class Uzumaki extends Ninja implements NinjaInterface {

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é " + nome);
    }

    @Override
    public void tacarUmaShuriken() {
        System.out.println(nome + " tacou uma shuriken!");
    }
}
