package com.programowanie.obserwator;

public class CTO implements AnimalAddedListener {


    @Override
    public void onAnimaAdded(Animal animal) {

        System.out.println("Nowe zwierzę dla szefa: " + animal.getName());
    }
}
