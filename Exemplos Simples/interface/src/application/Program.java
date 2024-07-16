package application;

import model.entitie.CarRental;
import service.ServiceCar;
import util.Require;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CarRental car = Require.readData();
        ServiceCar.processInvoice(car);

        String out = String.format("FATURA:%n Pagamento básico: %.2fR$ %nImposto: %.2fR$ %nTotal: %.2fR$%n", car.getInvoice().getBasicPayment(), car.getInvoice().getTax(), car.getInvoice().calculatePayment());
        System.out.print(out);

        sc.close();
    }
}
