package application;

import java.util.ArrayList;
import java.util.Arrays;
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

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> st1 = list.stream().map(x -> x*10);

        System.out.println(Arrays.toString(st1.toArray()));


    }
}
