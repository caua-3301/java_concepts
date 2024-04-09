package main;

import account.Account;
import model.excception.UnlimitedEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account conta = new Account(2544, "Cauã Pires Soares", 700.0, 500.0);

        try {
            //conta.withdraw(110.0);
            conta.withdraw(650.0);
        } catch (UnlimitedEx content) {
            System.out.println("Erro: " + content.getMessage());
        }

        System.out.println(conta.getBalance());
    }
}
