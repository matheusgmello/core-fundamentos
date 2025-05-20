package Intermediario;

public class Uchiha extends Ninja {

    /*
     * O Método VOID não retorna valor nenhum.
     * */
    public void ShariganAtivado(){
        System.out.println("Meu nome é " + nome + ", O Sharigan Ativou, eu sou um Uchiha");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + ", e esse é o meu ataque Uchiha!, um ataque de fogo🔥🔥🔥");
    }
}
