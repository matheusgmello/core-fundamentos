package Intermediario.HerancaMultipla;

public abstract class Ninja {

     String nome;
     String aldeia;
     int idade;

     public Ninja(){
     }

     public Ninja(String nome, String aldeia, int idade) {
          this.nome = nome;
          this.aldeia = aldeia;
          this.idade = idade;
     }

     public void habilidadeEspecial() {
          System.out.println("Meu nombre es " + nome + " e este es mi ataque especial");
     }

}
