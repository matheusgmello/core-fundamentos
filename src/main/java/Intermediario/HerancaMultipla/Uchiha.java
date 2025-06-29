package Intermediario.HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void  shariganAtivado() {
        System.out.println(nome + ": Ativou o sharingan");
    }

}
