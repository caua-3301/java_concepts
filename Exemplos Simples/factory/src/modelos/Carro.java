package modelos;

import interfaces.ModeloVeiculo;

public class Carro implements ModeloVeiculo {
    @Override
    public void testarMotor() {
        System.out.println("O motor do carro está bom");
    }

    @Override
    public void checarOleo() {
        System.out.println("O oleo v12 da McLaren está bom");
    }
}
