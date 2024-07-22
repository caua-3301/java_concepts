package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> st1 = list.stream().map(x -> x*10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> str2 = Stream.of("Caua", "Jose", "Maria");
        System.out.println(Arrays.toString(str2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
        System.out.println(Arrays.toString(st3.limit(15).toArray()));*/

        String path = "src/data/content.txt";
        List<Product> list = new ArrayList<>();

        try(BufferedReader buffer = new BufferedReader(new FileReader(path))) {
            String line = buffer.readLine();

            while (line != null) {
                String[] item = line.split(", ");
                list.add(new Product(item[0], Double.parseDouble(item[1])));
                line = buffer.readLine();
            }
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }

        double reference_price = 10.50;

        Comparator<Product> comparator = (product1, product2) -> product1.getName().toLowerCase().compareTo(product2.getName().toLowerCase());

        //nome dos itens com o preco maior que 10.50 em onderm alfbetica
        list.stream()
                .filter(product -> product.getPrice() > reference_price)
                .sorted(comparator)
                .map(Product::getName)
                .forEach(System.out::println);

        double sum_of_product = list.stream()
                .filter(product -> product.getName().startsWith("M"))
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);

        System.out.println(sum_of_product);
    }
}
