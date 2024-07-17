package entities;

import util.GenerateId;

import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class Employee extends Person {
    private String id;
    private String office;

    //how add contract
    private Contract contract_of_person;

    public Employee(String id, String office, Date date_nasc, String name) throws NoSuchAlgorithmException {
        super(name, date_nasc);
        this.id = GenerateId.generateId(name.substring(0, 3));
        this.office = office;
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
