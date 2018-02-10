package com.programowanie.obserwator;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.registerAnimalAddedListener(new Visitor());

        zoo.addAnimal(new Animal("Lew"));
        zoo.addAnimal(new Animal("Gepard"));
        zoo.addAnimal(new Animal("Słoń"));

    }
}
