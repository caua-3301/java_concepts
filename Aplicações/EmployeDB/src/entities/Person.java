package entities;

import jdk.jfr.Period;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class Person {
    private String name;
    private Date date_nasc;

    public Person(String name, Date date_nasc) {
        this.name = name;
        this.date_nasc = date_nasc;
    }

    public int getAgeOfPerson() {
        return (LocalDateTime.now().getYear() - this.getDate_nasc().getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_nasc() {
        return date_nasc;
    }

    public void setDate_nasc(Date date_nasc) {
        this.date_nasc = date_nasc;
    }
}
