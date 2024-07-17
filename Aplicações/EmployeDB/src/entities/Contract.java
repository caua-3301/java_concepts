package entities;

import util.GenerateId;

import java.security.NoSuchAlgorithmException;
import java.util.Date;

public abstract class Contract {
    private final String id;
    private Date contract_date;
    private double wage;

    public Contract(int id, Date contract_date, double wage) throws NoSuchAlgorithmException {
        this.id = GenerateId.generateId(contract_date.toString());
        this.contract_date = contract_date;
        this.wage = wage;
    }

    public String getId() {
        return id;
    }

    public Date getContract_date() {
        return contract_date;
    }

    public void setContract_date(Date contract_date) {
        this.contract_date = contract_date;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
