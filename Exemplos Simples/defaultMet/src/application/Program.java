package application;

import interfaces.InterfaceInter;
import service.BrazilianService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InterfaceInter bService = new BrazilianService(2);

        System.out.println("Valor do emprestimo: ");
        double valor = sc.nextDouble();
        System.out.println("Tempo de emprestimo: ");
        int tempo = sc.nextInt();

        System.out.printf("O valor final sera de: %.2f", bService.payment(valor, tempo));
    }
}
