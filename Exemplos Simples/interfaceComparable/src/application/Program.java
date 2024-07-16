package application;

import entities.EMployee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {
        List<EMployee> list = new ArrayList<>();
        String path = "C:/Users/Usuario/Desktop/GitHub/java_concepts/Exemplos Simples/interfaceComparable/util/input.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String emplpoyeCsv = br.readLine();

            while (emplpoyeCsv != null) {

                String[] employ = emplpoyeCsv.split(",");

                list.add(new EMployee(employ[1], employ[0]));

                emplpoyeCsv = br.readLine();
            }
            Collections.sort(list);

            for (EMployee employ: list) {
                System.out.printf("%s - %s%n", employ.getName(), employ.getId());
            }
        }
        catch (IOException error) {
            System.out.println("Um erro ocorreu " + error.getMessage());
        }
    }
}
