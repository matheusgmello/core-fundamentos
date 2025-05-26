package Intermediario;

public abstract class Ninja {

     String nome;
     String aldeia;
     int idade;

     // Método abstratos
     public abstract void nomeDoNinja();

     public void tacarKunai(){
            System.out.println(nome + " tacou uma kunai!");
     }

}
