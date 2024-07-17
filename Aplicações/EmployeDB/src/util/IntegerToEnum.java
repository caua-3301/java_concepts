package util;

import enums.Options;

public class IntegerToEnum {
    public static Options activate(int number) {
        return switch (number) {
            case 1 -> Options.INSERT_INTO;
            case 2 -> Options.SELECT_ALL;
            case 3 -> Options.CLOSE;
            default -> throw new IllegalStateException("Valor invalido: " + number);
        };
    }
}
