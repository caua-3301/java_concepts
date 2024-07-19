package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> b = new TreeSet<>(Arrays.asList(1,2, 8, 9,10));

        //union of a(c) with b
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection of a(d) with b
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //deference between a and b
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        //deference between b and a
        Set<Integer> f = new TreeSet<>(b);
        f.removeAll(a);
        System.out.println(f);

        /*Set<String> set = new LinkedHashSet<>();

        set.add("Asus-vivobook");
        set.add("Apple Mackbook");
        set.add("Sansung Air");

        set.remove("Asus-vivobook");

        System.out.println(set.contains("Asus-vivobook"));

        set.removeIf(x -> x.length() < 3);

        for (String item: set) {
            System.out.println(item);
        } */
    }
}
