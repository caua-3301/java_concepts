package entities;

import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class JuniorContract extends Contract implements WageCalculator{

    public JuniorContract(int id, Date contract_date, double wage) throws NoSuchAlgorithmException {
        super(id, contract_date, wage);
    }

    @Override
    public double calculateWage() {
        return this.getWage() * (1.01);
    }
}
