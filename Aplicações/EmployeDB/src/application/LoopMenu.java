package application;

import enums.Options;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class LoopMenu {
    public static void loadMenu() throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);

        Options option = Choice.choiceAOption();

        while (option != Options.CLOSE) {
            Menu.activateMenu(option);
            option = Choice.choiceAOption();
        }
    }
}
