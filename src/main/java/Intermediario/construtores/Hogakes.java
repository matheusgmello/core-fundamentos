package Intermediario.construtores;

public abstract class Hogakes {

    String nome;
    int idade;
    Boolean vivoOuNao;


    public abstract void sabedoriaHokage();

    public Hogakes(){
        // Construtor vazio, sem argumentos
    }

    // Construtores com argumentos
    public Hogakes(String nome) {
        this.nome = nome;
    }

    public Hogakes(int idade){
        this.idade = idade;
    }

    // Construtor com todos os argumentos = All args co
    public Hogakes(String nome, int idade, Boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }


}
