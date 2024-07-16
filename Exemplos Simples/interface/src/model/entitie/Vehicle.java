package model.entitie;

public class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }
    public  Vehicle() {
        this.model = "undefined-vehicle";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
