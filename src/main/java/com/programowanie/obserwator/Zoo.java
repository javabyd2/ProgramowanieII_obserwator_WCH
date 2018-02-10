package com.programowanie.obserwator;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();
    private List<AnimalAddedListener> listeners = new ArrayList<>();

    public void addAnimal(Animal animal) {
        //dodanie obiektu animal do Listy
        this.animals.add(animal);

        this.notifyAnimal(animal);
    }

    public void registerAnimalAddedListener(AnimalAddedListener animalAddedListener) {
        this.listeners.add(animalAddedListener);
    }

    public void unregisterAnimalAddedListener(AnimalAddedListener animalAddedListener) {
        this.listeners.remove(animalAddedListener);
    }

    public void notifyAnimal(Animal animal) {
        this.listeners.forEach(listener -> listener.onAnimaAdded(animal));
    }
}
