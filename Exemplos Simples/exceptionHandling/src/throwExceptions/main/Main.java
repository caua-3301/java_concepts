package throwExceptions.main;

import throwExceptions.hotel.Reservation;
import throwExceptions.model.exceptions.DomainExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        try {
            Scanner sc = new Scanner(System.in);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Number of room");
            int numberRoom = sc.nextInt();

            System.out.println("Check in date (dd/mm/yyyy)");
            Date checkInDate = sdf.parse(sc.next());

            System.out.println("Check out date (dd/mm/yyyy)");
            Date checkOutDate = sdf.parse(sc.next());

            Reservation reservation = new Reservation(numberRoom, checkInDate, checkOutDate);

            System.out.println(reservation.toString());

            sc.close();
        }
        catch (ParseException e) {
            System.out.println("Data digitada não compatível");
        }
        catch (DomainExceptions e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro inesperado");
        }

    }
}
