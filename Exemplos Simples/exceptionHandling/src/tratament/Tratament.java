package tratament;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratament {
    public static void activateProgram () {

        Scanner sc = new Scanner(System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt()-1;

            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida");
        }
        catch (InputMismatchException e) {
            System.out.println("Tipo de entrada invalido");
        }

        System.out.println("Fim do programa");

        sc.close();
    }
}
