package model.service;

public class BrazilianTaxService implements Tax {
    @Override
    public double tax(double amount) {
        if (amount <= 100) {
            return amount * 0.2;
        }
        return  amount * 0.15;
    }
}
