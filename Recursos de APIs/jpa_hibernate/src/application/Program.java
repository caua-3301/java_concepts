package application;

import model.entities.Pessoa;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Pessoa[] pessoas = {new Pessoa(1, "Caua Pires"), new Pessoa(2, "Jose da Silva"), new Pessoa(3, "Maria Guimaraes")};

        Arrays.stream(pessoas).forEach(System.out::println);

    }
}
