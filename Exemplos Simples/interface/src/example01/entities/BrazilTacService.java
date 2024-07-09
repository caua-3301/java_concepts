package example01.entities;

public class BrazilTacService {
    public static Double tax(Double amount) {
        //20% of tax in brazil
        return amount > 100 ? amount * 1.2 : amount * 1.15;
    }
}
