package org.example.oop.Hw3.Ex1;

public class Coffee extends Drink{
    public Coffee(String name, Double price, Double volume) { super(name, price, volume);}
    public String toString() {
        String var = this.getName();
        return "Coffee " + var + " " + this.getVolume();
    }
}
