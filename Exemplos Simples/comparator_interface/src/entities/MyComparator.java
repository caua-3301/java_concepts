package entities;

import java.util.Comparator;

//implementação em uma outra classe
public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product productA, Product productB) {
        return productA.getName().toLowerCase().compareTo(productB.getName().toLowerCase());
    }
}
