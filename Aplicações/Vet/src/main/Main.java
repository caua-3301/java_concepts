package main;

import java.util.Scanner;
import util.Cachorro;
import util.Gato;
import util.Veterinario;

public class Main {
    public static void main(String[] args) {
        Cachorro saulo = new Cachorro("Saulo", 10);
        Gato nick = new Gato("Nick", 21);

        Veterinario caua = new Veterinario("Caua");

        caua.atenderAimal(saulo);
        caua.atenderAimal(nick);
    }
}
