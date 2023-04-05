package org.example.oop.Cw3.Ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CatShelter extends AnimalShelter {
    private List<Animal> animals = new ArrayList();

    public CatShelter() {
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void print() {
        Iterator var1 = this.animals.iterator();

        while(var1.hasNext()) {
            Animal animal = (Animal)var1.next();
            System.out.println(animal);
        }

    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public void sort(AnimalComparator comparator) {
        Collections.sort(this.animals, comparator);
    }
}
