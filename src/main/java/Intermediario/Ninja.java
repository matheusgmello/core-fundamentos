package Intermediario;

public class Ninja {

     String nome;
     String aldeia;
     int idade;



     // Criar um método publico personalizado

     /*
     * O metodo VOID não retorna valor nenhum
     * */

     public void ShariganAtivado(){
            System.out.println("O Sharigan foi ativado");
     }

     /*
     * O método String obrigatorimente deve retornar um valor do tipo String
     * */

     public String EuSouUmninja(){
            return "Eu sou um ninja";
     }

     /*
     * Metodo INT vai ter que retornar um valor do tipo inteiro
     * */

     public int anosParaSeTornarHokage(int IdadeMinimaParaSerHokage){
            return IdadeMinimaParaSerHokage - idade;
     }

}
