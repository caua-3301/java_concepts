package entities;

import util.GenerateId;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Contract {
    private final String id;
    private LocalDate contract_date;
    private double wage;

    public Contract(String hash_for_id, LocalDate contract_date, double wage) throws NoSuchAlgorithmException {
        this.id = GenerateId.generateId(hash_for_id);
        this.contract_date = contract_date;
        this.wage = wage;
    }

    public Contract() {
        this.id = "id_not_valid";
        this.contract_date = LocalDate.now();
        this.wage = 0.00;
    }

    public String getId() {
        return id;
    }

    public LocalDate getContract_date() {
        return contract_date;
    }

    public void setContract_date(LocalDate contract_date) {
        this.contract_date = contract_date;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
