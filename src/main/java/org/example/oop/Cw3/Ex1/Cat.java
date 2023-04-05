package org.example.oop.Cw3.Ex1;

import java.util.ConcurrentModificationException;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}