package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "\\src\\files\\input.txt";

        File file = new File(path);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
