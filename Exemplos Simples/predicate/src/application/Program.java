package application;

import entities.ConsumerProduct;
import entities.Product;
import entities.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

        list.forEach(new ConsumerProduct());

        list.forEach(x -> System.out.println(x.getPrice()));
    }
}
