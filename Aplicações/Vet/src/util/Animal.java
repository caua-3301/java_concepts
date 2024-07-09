package util;

abstract class Animal {
    private final String nome;
    private final int idade;

    public Animal() {
        this.nome = "gem";
        this.idade = 0;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void fazerSom();

    public void dormir() {
        System.out.println("O animal esta dormindo");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
