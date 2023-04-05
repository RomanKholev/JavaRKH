package org.example.oop.Cw3.Ex3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CatShelter shelter = new CatShelter();

        for(int i = 0; i < 5; ++i) {
            if (i % 2 == 0) {
                shelter.addAnimal(new Cat(i * 2, i * 3, "cat" + i));
            } else {
                shelter.addAnimal(new Dog(i * 3, i * 4, "dog" + i));
            }
        }

        shelter.print();
        shelter.sort(new AnimalComparator("age"));
        System.out.println("---");
        shelter.print();
    }
}
