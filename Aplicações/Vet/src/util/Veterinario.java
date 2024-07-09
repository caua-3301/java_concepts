package util;

public class Veterinario {
    private String nome;

    public Veterinario() {
        this.nome = "nomeGem";
    }

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void atenderAimal(Animal animal) {
        System.out.println(animal.getNome());
        System.out.println(animal.getIdade());
        animal.fazerSom();
    }
}
