package application;

import classes.Animal;
import classes.Cachorro;
import classes.Gato;
import service.Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {
        /*
        Tipos genericos na definição de classes

        Gato animal1 = new Gato();
        Cachorro animal2 = new Cachorro();

        Food<Animal> foodHer = new Food<>();

        foodHer.alimentar(animal1);
        foodHer.alimentar(animal1);*/

        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> listObj = new ArrayList<>();

        copy(listObj, listInt);

        printList(listObj);
    }

    /*exemplo de como os tipos coringas delimitados funcionam
    *
    * Exemplo de covariancia e contravariancia
    * <? super x> = get - err; set - ok
    * <? extends x> = get - ok; set - err
    *
    * */

    public static void copy(List<? super Number> recebe, List<? extends Number> envia) {
        for(Number number: envia) {
            recebe.add(number);
        }
    }

    public static void printList(List<? extends Object> list) {
        for(Object item: list) {
            System.out.println(item);
        }
    }

}
