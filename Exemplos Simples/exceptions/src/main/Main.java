package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method01();

        System.out.println("Fim do programa");
    }

    public static void method01() {
        System.out.println("***METODO 1 START***");
        method02();
        System.out.println("***METODO 1 END***");
    }

    public static void method02() {
        System.out.println("***METODO 2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] words = sc.nextLine().split(" ");
            System.out.println(words[sc.nextInt() - 1]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
            //exibe a pilha de chamandas que gerou a exceção
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Esperado um numero e nao uma letra");
        }
        sc.close();
        System.out.println("***METODO 2 END***");
    }
}
