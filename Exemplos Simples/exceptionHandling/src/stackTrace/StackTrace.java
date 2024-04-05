package stackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {

    public static void method01() {
        System.out.println("Method 01 start");
        method02();
        System.out.println("Method 01 end");
    }

    public static void method02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Method 2 start");

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt()-1;

            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Tipo de entrada invalido");
        }

        System.out.println("Method 02 end");
        sc.close();
    }
    public static void activateProgramStack () {
        method01();

        System.out.println("Fim do programa");
    }
}
