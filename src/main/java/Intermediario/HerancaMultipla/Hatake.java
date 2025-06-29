package Intermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface,  AnbuInterface, HogakeInterface {
    @Override
    public void ninjaDeElite() {
        System.out.println("Meu nome eh " + nome + " e eu sou da anbu");
    }

    public Hatake() {
        super();
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    void boasVindas(){
        System.out.println("Boas vindas eu sou um hatake");
    }

    @Override
    public void shariganAtivado() {
        System.out.println(nome + ": Ativou o sharingan");
    }

    @Override
    public void hokageAtivo() {
        System.out.println("Eu sou o sexto hogake");
    }
}
