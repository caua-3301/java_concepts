package util;

import interfaces.Ciclista;
import interfaces.Corredor;
import interfaces.Nadador;

public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador {
    public Triatleta(String nome) {
        super(nome);
    }

    public void aquecer() {
        System.out.printf("%s está aquecendo %n", this.getNome());
    }

    public void nadar() {
        System.out.printf("%s está nadando %n", this.getNome());
    }

    public void correr() {
        System.out.printf("%s está correndo %n", this.getNome());
    }

    public void pedalar() {
        System.out.printf("%s está pedalando %n", this.getNome());
    }
}
