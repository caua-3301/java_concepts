package applications;

import entities.Client;

public class Program {
    public static void main(String[] args) {
        Client maria = new Client("Maria", "maria@.com");
        Client alex = new Client("Maria", "alex@.com");

        System.out.println(maria.equals(alex));
    }
}
