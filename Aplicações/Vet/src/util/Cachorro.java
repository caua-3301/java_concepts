package util;

public class Cachorro  extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("O cahorro late");
    }
}
