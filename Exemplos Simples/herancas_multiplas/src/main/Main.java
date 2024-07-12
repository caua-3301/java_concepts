package main;

import investimento.util.Poupanca;
import util.Pessoa;
import util.Triatleta;

public class Main {
    public static void main(String[] args) {
        /*Triatleta triatleta_of = new Triatleta("Cauã Pires Soares");
        triatleta_of.aquecer();
        triatleta_of.nadar();
        triatleta_of.correr();
        triatleta_of.pedalar();*/

        Poupanca minhaPoupanca = new Poupanca("Cauã Pires", "6374-11", "123.456.789-11");
        minhaPoupanca.depositar(1200);
        System.out.println(minhaPoupanca.toString());
        minhaPoupanca.fazerRender();
        System.out.println(minhaPoupanca.toString());
        minhaPoupanca.reajustar(0.08);
        minhaPoupanca.sacar(20);
        System.out.println(minhaPoupanca.toString());
    }
}
