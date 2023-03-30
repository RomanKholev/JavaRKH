package org.example.oop.Hw1;


public interface Machine {
    Drink getDrink(String name) throws IllegalStateException;
}