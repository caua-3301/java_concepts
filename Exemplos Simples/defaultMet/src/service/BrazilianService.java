package service;

import interfaces.InterfaceInter;

public class BrazilianService implements InterfaceInter {
    private double interestRate;

    public BrazilianService(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public double getInterestRate() {
        return interestRate/100;
    }
}
