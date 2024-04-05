package finallyTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyTest {
    public static void activateFinallyTest() {
        File file = new File("content.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro na operacao do arquivo: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finalizado");
        }
    }
}
