package investimento.util;

public class Conta {
    private String titular, numero, cpf;
    private double valor_em_conta;

    public Conta(String titular, String numero, String cpf) {
        this.titular = titular;
        this.numero = numero;
        this.cpf = cpf;
        this.valor_em_conta = 0;
    }

    public double extrato() {
        return this.valor_em_conta;
    }

    public void depositar(double valor) {
        this.valor_em_conta += valor > 0 ? valor : 0;
        System.out.printf("Sua conta esta agora com %.2f R$%n", this.valor_em_conta);
    }

    public void sacar(double valor) {
        if (valor <= valor_em_conta) {
            this.valor_em_conta -= valor;
        }
        System.out.printf("Voce possui em conta %.2f R$%n", this.valor_em_conta);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
