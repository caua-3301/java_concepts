package main;

import fabrica.Fabrica;
import interfaces.ModeloVeiculo;
import tipo.Veiculos;

public class Main {
    public static void main(String[] args) {
        ModeloVeiculo siena = Fabrica.criarVeiculo(Veiculos.CARRO);
        siena.checarOleo();
        siena.testarMotor();

        ModeloVeiculo cb650 = Fabrica.criarVeiculo(Veiculos.MOTO);
        cb650.testarMotor();
        cb650.checarOleo();
    }
}
