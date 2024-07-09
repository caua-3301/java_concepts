package example01.entities;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTacService brazilTacService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTacService brazilTacService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTacService = brazilTacService;
    }

    public void processInvoice(CarRental car) {
        Duration time = Duration.between(car.getFinish(), car.getStart());

        double valueInDay = 0;

        long seconds = time.getSeconds();

        car.setInvoiceCar(new Invoice());
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
