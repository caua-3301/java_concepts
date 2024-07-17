package application;

import enums.Options;
import util.IntegerToEnum;

import java.util.Scanner;

public class Choice {
    public static Options choiceAOption() {
        Scanner sc = new Scanner(System.in);
        Options option = Options.SELECT_ALL;

        String out = String.format("INFORME A OPÇÃO DESEJADA: %n" +
                "1 - Adicionar funcionário; %n" +
                "2 - Listar funcionários; %n" +
                "3 - Encerrar");

        System.out.println(out);

        try {
            option = IntegerToEnum.activate(sc.nextInt());
        }
        catch (IllegalStateException err) {
            System.out.println("Problema ao selecionar opcao: " + err.getMessage());
        }

        return option;
    }
}
