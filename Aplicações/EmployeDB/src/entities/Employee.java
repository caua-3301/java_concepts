package entities;

import util.GenerateId;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Employee extends Person {
    private String id;
    private String office;

    //how add contract
    private Contract contract_of_person;

    public Employee(String office, LocalDate date_nasc, String name) throws NoSuchAlgorithmException {
        super(name, date_nasc);
        this.id = GenerateId.generateId(name.substring(0, 3));
        this.office = office;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%s,%.2f; \n", this.getName(), this.getOffice(), this.getAgeOfPerson(), this.getDate_nasc().toString(), this.contract_of_person.getWage());
    }

    public void setContract_of_person(Contract contract) {
        this.contract_of_person = contract;
    }

    public String getId() {
        return id;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
