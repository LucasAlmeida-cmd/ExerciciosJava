package Dominio;

public class Cachorro extends Animal implements Som {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo: Au Au!");
    }
}
