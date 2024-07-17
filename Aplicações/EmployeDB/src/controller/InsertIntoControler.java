package controller;

import entities.Employee;
import service.FactoryContract;
import service.FactoryEmployee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class InsertIntoControler {
    public static void insertInto() throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String relative_path = "src/data/data.txt";

        Employee employee = FactoryEmployee.createEmployee();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(relative_path, true))) {
            String content = employee.toString();
            writer.write(content);
            System.out.println("Item " + content + " adicionado!");
        }
        catch (IOException err) {
            System.out.println("Um erro ocorreu ao gravar os arquivos: " + err.getMessage());
        }
    }
}
