package org.example.oop.Hw3.Ex1;

public class Tea extends Drink{
    public Tea(String name, Double price, Double volume) { super(name, price, volume);}
    public String toString() {
        String var = this.getName();
        return "Tea " + var + " " + this.getVolume();
    }
}


