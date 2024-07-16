package printMachine.application;

import printMachine.utils.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.println("Quantos valores?");
        int valores = sc.nextInt();

        System.out.println("Digite: ");
        while (valores-- != 0) {
            ps.addValues(sc.nextLine());
        }

        ps.print();
        System.out.println(ps.first());
    }
}
