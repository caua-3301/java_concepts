package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Employee> list_employee = new ArrayList<>();

        try (BufferedReader buffer = new BufferedReader(new FileReader("src/data/content.txt"))) {
            String line = buffer.readLine();

            while (line != null) {
                String[] itens = line.split(", ");
                list_employee.add(new Employee(itens[0], Integer.parseInt(itens[1])));
                line = buffer.readLine();
            }

        } catch (IOException err) {
            System.out.println(err.getMessage());
        }

        double avarage_price = list_employee.stream().map(Employee::getWage).reduce(0.0, Double::sum)/ (double) list_employee.size();
        System.out.printf("%.2f", avarage_price);

        Comparator<String> comp = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());

        List<String> list = list_employee.stream()
                .filter(prod -> prod.getWage() < avarage_price)
                .map(Employee::getName)
                .sorted(comp.reversed())
                .toList();

        list.forEach(System.out::println);
    }
}
