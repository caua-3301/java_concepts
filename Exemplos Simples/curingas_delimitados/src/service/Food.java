package service;

import classes.Animal;

import java.util.List;

public class Food<T extends Animal> {

    public void alimentar(T animal) {
        animal.som();
    }
}
