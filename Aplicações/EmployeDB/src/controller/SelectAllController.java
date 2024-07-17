package controller;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SelectAllController {
    public static void selectAll() {
        String path_relative = "src/data/data.txt";

        try(BufferedReader buffer = new BufferedReader(new FileReader(path_relative))) {
            String line = buffer.readLine();

            System.out.printf("\n FUNCIONARIOS CADASTRADOS: \n\n\tNOME,CARGO,IDADE,DATA_NASC,SALARIO\n");
            while (line != null) {
                System.out.printf("\t%s\n", line);
                line = buffer.readLine();
            }

            System.out.printf("\n\n");
        }
        catch (IOException err) {
            System.out.println("Problema no arquivo: " + err.getMessage());
        }
    }
}
