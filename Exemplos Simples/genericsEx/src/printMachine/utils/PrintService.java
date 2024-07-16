package printMachine.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintService<Type> {
    private List<Type> list = new ArrayList<>();
    public void addValues(Type value) {
        list.add(value);
    }

    public Type first() {
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        for (Type item: list) {
            System.out.print(item + ", ");
        }
        System.out.printf("]%n");
    }

}
