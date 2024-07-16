package service;

import model.entitie.CarRental;
import model.entitie.Invoice;
import model.service.BrazilianTaxService;

import java.time.Duration;

public class ServiceCar {
    public static void processInvoice(CarRental car) {
        double pricePeerHour = 10;
        double pricePeerDay = 130;

        double minutes = Duration.between(car.getStart(), car.getFinish()).toMinutes();
        double hours = Math.ceil(minutes/60);

        double basicPayment;

        if (hours <= 12) {
            basicPayment = hours * pricePeerHour;
        }
        else {
            basicPayment = Math.ceil(hours/24) * pricePeerDay;
        }

        car.setInvoice(new Invoice(basicPayment, new BrazilianTaxService().tax(basicPayment)));
    }
}
