package controller;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SelectAllController {
    public static void selectAll() {
        String path_relative = "src/data/data.txt";

        try(BufferedReader buffer = new BufferedReader(new FileReader(path_relative))) {
            String line = buffer.readLine();

            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        }
        catch (IOException err) {
            System.out.println("Problema no arquivo: " + err.getMessage());
        }
    }
}
