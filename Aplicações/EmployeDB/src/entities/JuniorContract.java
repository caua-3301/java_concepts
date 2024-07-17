package entities;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;

public class JuniorContract extends Contract implements WageCalculator{

    public JuniorContract(String hash_for_id, LocalDate contract_date, double wage) throws NoSuchAlgorithmException {
        super(hash_for_id, contract_date, wage);
    }

    @Override
    public double calculateWage() {
        return this.getWage() * (1.01);
    }
}
