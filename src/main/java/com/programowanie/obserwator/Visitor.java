package com.programowanie.obserwator;

public class Visitor implements AnimalAddedListener {

    @Override
    public void onAnimaAdded(Animal animal) {
        System.out.println("Nowe zwierzę przybyło do zoo: " + animal.getName());
    }
}
