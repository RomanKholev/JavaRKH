package org.example.oop.Cw3.Ex3;

public class Cat extends Animal {
    public Cat(Integer age, Integer weight, String name) {
        super(age, weight, name);
    }

    public String toString() {
        String var10000 = this.getName();
        return "Cat " + var10000 + " " + this.getWeight();
    }
}
