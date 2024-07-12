package main;

import util.Pessoa;
import util.Triatleta;

public class Main {
    public static void main(String[] args) {
        Triatleta triatleta_of = new Triatleta("Cauã Pires Soares");
        triatleta_of.aquecer();
        triatleta_of.nadar();
        triatleta_of.correr();
        triatleta_of.pedalar();
    }
}
