package application;

import entities.MyComparator;
import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list_prod = new ArrayList<>();

        list_prod.add(new Product("Notebook", 2500));
        list_prod.add(new Product("Armario", 800));
        list_prod.add(new Product("Epson Jet", 1200));

        //classe anonima com expressao lambda

        Comparator<Product> comp = (p1, p2) -> { return p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()); };

        list_prod.sort(comp);

        for(Product p: list_prod) {
            System.out.printf("%s -> %.2f%n", p.getName(), p.getPrice());
        }
    }
}
