package investimento.util;

import investimento.interfaces.Investimento;

public class Poupanca extends Conta implements Investimento {
    protected double rendimento_mensal;

    public Poupanca(String titular, String numero, String cpf) {
        super(titular, numero, cpf);
        this.rendimento_mensal = 0.02;
    }

    @Override
    public String toString() {
        return String.format("O saldo em conta e de %.2f%n", this.extrato());
    }

    public void fazerRender() {
        depositar(this.extrato() * (this.rendimento_mensal + 1));
    }

    @Override
    public void reajustar(double valor) {
        this.rendimento_mensal = valor;
    }
}
