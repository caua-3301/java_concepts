package example01.entities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime finish;
    private Vehicle vehicleCar;
    private Invoice invoiceCar;

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicleCar) {
        this.start = start;
        this.finish = finish;
        this.vehicleCar = vehicleCar;
    }

    public Vehicle getVehicleCar() {
        return vehicleCar;
    }

    public void setVehicleCar(Vehicle vehicleCar) {
        this.vehicleCar = vehicleCar;
    }

    public Invoice getInvoiceCar() {
        return invoiceCar;
    }

    public void setInvoiceCar(Invoice invoiceCar) {
        this.invoiceCar = invoiceCar;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }
}
