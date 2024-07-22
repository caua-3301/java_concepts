package entities;

import java.util.List;
import java.util.function.Predicate;

public class ProductSum {
    public static double filteredSum(List<Product> list, Predicate<Product> predicate) {
        double sum = 0;
        for(Product prod: list) {
            sum += predicate.test(prod) ? prod.getPrice() : 0;
        }
        return sum;
    }
}
