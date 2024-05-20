package files;

import java.io.File;
import java.util.Scanner;

public class Manipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um caminho");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS");

        for (File folder: folders) {
            System.out.println(folder);
        }
    }
}
