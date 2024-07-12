package modelos;

import interfaces.ModeloVeiculo;

public class Moto implements ModeloVeiculo {
    @Override
    public void testarMotor() {
        System.out.println("O motor da moto está bom");
    }

    @Override
    public void checarOleo() {
        System.out.println("O oleo da CB650 está bom");
    }
}
