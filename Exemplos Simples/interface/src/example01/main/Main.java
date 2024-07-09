package example01.main;

import example01.entities.BrazilTacService;
import example01.entities.CarRental;
import example01.entities.RentalService;
import example01.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Dados do aluguel: ");

        System.out.println("Modelo do carro: ");
        Vehicle carModel = new Vehicle(sc.nextLine());

        System.out.println("Data e hora da retirada: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.println("Data e hora do retorno: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental firstCar = new CarRental(start, finish, carModel);

        System.out.println("Preco pelo dia: ");
        double pricePerDay = sc.nextDouble();
        System.out.println("Preco por hora: ");
        double pricePerHour = sc.nextDouble();

        RentalService rental = new RentalService(pricePerHour, pricePerDay, new BrazilTacService());

        rental.processInvoice(firstCar);
        System.out.println("FATURA");
        System.out.println("Pagamento basico:" + firstCar.getInvoiceCar().getBasicPayment());
        System.out.println("Valor taxa:" + firstCar.getInvoiceCar().getTax());
        System.out.println("Pagamento total:" + firstCar.getInvoiceCar().getTotalPayment());

        sc.close();
    }
}
