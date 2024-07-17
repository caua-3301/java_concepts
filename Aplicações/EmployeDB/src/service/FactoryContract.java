package service;

import entities.Contract;
import entities.JuniorContract;
import entities.SeniorContract;
import enums.LevelEmployee;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FactoryContract {
    public static Contract createContract(String hash_to_id, LevelEmployee level) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date_contract = LocalDate.now();
        double wave = 0.00;

        try {
            System.out.println("Informe a data do contrato (dd/mm/aaaa): ");
            date_contract = LocalDate.parse(sc.nextLine(), dtf);

            System.out.println("Informe o salario: ");
            wave = sc.nextDouble();

            if (wave < 0) {
                throw new IOException("Valor de salario invaldo");
            }
        } catch (IOException err) {
            System.out.println("Error ao criar contrato " + err.getMessage());
        }

        return switch (level) {
            case JUNIOR -> new JuniorContract(hash_to_id, date_contract, wave);
            case SENIOR -> new SeniorContract(hash_to_id, date_contract, wave);
        };
    }
}
