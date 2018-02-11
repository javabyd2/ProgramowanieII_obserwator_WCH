package com.programowanie.obserwator;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        CTO cto = new CTO();
        Visitor visitor = new Visitor();

        zoo.registerAnimalAddedListener(cto);
        zoo.registerAnimalAddedListener(visitor);

        zoo.addAnimal(new Animal("Lew"));
        zoo.addAnimal(new Animal("Gepard"));
        zoo.addAnimal(new Animal("Słoń"));
        zoo.unregisterAnimalAddedListener(cto);
        zoo.addAnimal(new Animal("Ptak"));
        zoo.addAnimal(new Animal("Żółw"));
        zoo.unregisterAnimalAddedListener(visitor);

    }
}
