package Intermediario;

public class Main {
    public static void main(String[] args) {

        // Objeto Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha - Konoha";
        Sasuke.idade = 17;

        // Aplicando um método ao o objeto
        Sasuke.ShariganAtivado();

        // Objeto Uzumaki
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha - Konoha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        // Objeto Haruno
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha - Konoha";
        Sakura.idade = 17;
        Sakura.AtivarCura();

        // Objeto Hyuga
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha - Konoha";
        Hinata.idade = 17;
        Hinata.ByakuganAtivado();

    }
}
