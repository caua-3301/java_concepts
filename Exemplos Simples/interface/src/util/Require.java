package util;

import model.entitie.CarRental;
import model.entitie.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Require {
    public static CarRental readData() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRO DO CARRO");
        System.out.println("Modelo do carro:");
        Vehicle atual_vehicle = new Vehicle(sc.nextLine());

        System.out.println("Data de retirada (xx/xx/xxxx xx:xx):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.println("Data de entrega (xx/xx/xxxx xx:xx):");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        return new CarRental(start, finish, atual_vehicle);
    }
}
