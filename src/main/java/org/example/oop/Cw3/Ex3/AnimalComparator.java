package org.example.oop.Cw3.Ex3;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    private final String type;

    public AnimalComparator(String type) {
        this.type = type;
    }

    public int compare(Animal o1, Animal o2) {
        switch (this.type) {
            case "weight":
                return o1.getWeight().compareTo(o2.getWeight());
            case "age":
                return o1.getAge().compareTo(o2.getAge());
            default:
                return 0;
        }
    }
}
