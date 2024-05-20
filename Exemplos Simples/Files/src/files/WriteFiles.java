package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {

    public static void main(String[] args) {
        String[] words = {"Ola", "Mundo", "Louco"};

        String path = System.getProperty("user.dir") + "\\src\\files\\input.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : words) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
