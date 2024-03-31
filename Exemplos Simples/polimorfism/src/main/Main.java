package main;

import employee.Employee;
import menu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Employee> employeets = new ArrayList<>();

        System.out.println("Informe quantos funcionários serão adicionados: ");
        int numberEmployee = sc.nextInt();

        Menu.activateMenu(numberEmployee, employeets);
        Menu.showEmployee(employeets);
    }
}
