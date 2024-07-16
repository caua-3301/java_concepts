package service;

import interfaces.InterfaceInter;

public class UsaService implements InterfaceInter {
    private double interestRate;

    public UsaService(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public double getInterestRate() {
        return interestRate/100;
    }
}
