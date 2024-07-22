package application;

import entities.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Product p1 = new Product("Mesa", 1200);
        Product p2 = new Product("Notebook", 3000);
        Product p3 = new Product("Cadeira", 500);
        Product p4 = new Product("Mouse", 80);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        //exemplo de aplicação do consumer
        list.forEach(new ConsumerProduct());

        //exemplo de aplicação do functioo
        List<String> lis_names = list.stream().map(new FunctionProduct()).toList();

        lis_names.forEach(System.out::println);

        list.forEach(x -> System.out.println(x.getPrice()));

        //recebendo uma função (nesse caso um preidcate) em uma função
        double sum_total = ProductSum.filteredSum(list, product -> product.getPrice() > 800);
        System.out.println(sum_total);
    }
}
