package service;

import entities.Contract;
import entities.Employee;
import enums.LevelEmployee;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FactoryEmployee {
    public static Employee createEmployee() throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String name = "empty";
        LocalDate date_nasc = LocalDate.parse("01/01/2000", dtf);
        String office = "empty";
        LevelEmployee level = LevelEmployee.JUNIOR;

        try {
            System.out.println("Informe o nome do funcionario: ");
            name = sc.nextLine();

            if (name.isEmpty()) {
                throw new IOException("Entrada vazia");
            }

            System.out.println("Informe a data de nascimento (dd/mm/aaaa): ");
            date_nasc = LocalDate.parse(sc.nextLine(), dtf);

            System.out.println("Informe o cargo do funcionario: ");
            office = sc.nextLine();

            if (office.isEmpty()) {
                throw new IOException("Entrada vazia");
            }

            System.out.println("Informe o tipo de contrato 1 = Junior, 2 = Senior: ");
            level =  switch (sc.nextInt()) {
                case 1 -> LevelEmployee.JUNIOR;
                case 2 -> LevelEmployee.SENIOR;
                default -> throw new IOException("Tipo de contrato invalido");
            };
        }
        catch (IOException err) {
            System.out.println("Error ao inserir dados " + err.getMessage());
        }

        Employee employee =  new Employee(office, date_nasc, name);

        //get the 8 first digits of id employee to create id contract
        employee.setContract_of_person(FactoryContract.createContract((employee.getId().substring(0, 8)), level));

        return employee;
    }
}
