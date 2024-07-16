package expansiveApp.application;

import expansiveApp.utils.Item;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\Usuario\\Desktop\\GitHub\\java_concepts\\Exemplos Simples\\genericsEx\\src\\expansiveApp\\data\\file.txt";

        List<Item> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

            String line = bf.readLine();

            while (line != null) {
                String[] item = line.split(",");
                list.add(new Item(item[0], Double.parseDouble(item[1])));
                line = bf.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
