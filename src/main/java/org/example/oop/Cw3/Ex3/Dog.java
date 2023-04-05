package org.example.oop.Cw3.Ex3;

public class Dog extends Animal {
    public Dog(Integer age, Integer weight, String name) {
        super(age, weight, name);
    }

    public String toString() {
        String var10000 = this.getName();
        return "Dog " + var10000 + " " + this.getWeight();
    }
}
