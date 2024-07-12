package util;

public class Pessoa {
    private String nome, categoria;

    public Pessoa(String nome, String categoria) {
        this.categoria = categoria;
        this.nome = nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.categoria = "desconhecida";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
