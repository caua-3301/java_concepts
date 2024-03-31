package menu;

import employee.Employee;
import employee.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void readAndAdd(List<Employee> employeeList, int out) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do funcionario:");
        String name = sc.nextLine();
        System.out.println("Informe o numero de horas trabalhadas:");
        int hours = sc.nextInt();
        System.out.println("Informe o valor pago por hora:");
        double valuePerHour = sc.nextDouble();
        sc.nextLine();

        if (out == 1) {
            System.out.println("Informe o valor adicional:");
            double aditional = sc.nextDouble();
            sc.nextLine();
            Employee employee = new OutSourcedEmployee(name, hours, valuePerHour, aditional);
            employeeList.add(employee);
        }
        else {
            Employee employee = new Employee(name, hours, valuePerHour);
            employeeList.add(employee);
        }
        sc.close();
    }
    public static int activateMenu(int numberCalls, List<Employee> employees) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Faltam " + numberCalls + " funcionarios para adicionar");

        System.out.println("O funcionário é terceirizado (s/n)?");

        if (sc.next().charAt(0) == 's') {
            readAndAdd(employees, 1);
        }
        else {
            readAndAdd(employees, 0);
        }

        sc.close();

        return numberCalls > 1 ? activateMenu(numberCalls-1, employees) : 0;
    }

    public static void showEmployee(List<Employee> employeeList) {
        employeeList.stream().forEach(employee -> {
            StringBuilder output = new StringBuilder();
            //i know, it's not necessary
            output.append("Nome:" + employee.getName() + "\n").append("Horas: " +employee.getHours()+"\n").append("Valor por hora:" + employee.getValuePerHour() + "\n").append("Salario: " + employee.payment() + "\n\n");
            System.out.println(output + "\n");
        });
    }
}
