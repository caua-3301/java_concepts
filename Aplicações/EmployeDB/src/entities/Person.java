package entities;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate date_nasc;

    public Person(String name, LocalDate date_nasc) {
        this.name = name;
        this.date_nasc = date_nasc;
    }

    public int getAgeOfPerson() {
        return (LocalDate.now().getYear() - this.getDate_nasc().getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate_nasc() {
        return date_nasc;
    }

    public void setDate_nasc(LocalDate date_nasc) {
        this.date_nasc = date_nasc;
    }
}
