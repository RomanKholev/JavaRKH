package org.example.oop.Hw3.Ex1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CoffeeBase extends DrinkBase {
    private List<Drink> drinks = new ArrayList<>();
    public CoffeeBase(){

    }
    public void addDrink(Drink drink) { this.drinks.add(drink);}
    public void print() {
        Iterator var1 = this.drinks.iterator();
        while (var1.hasNext()) {
            Drink drink = (Drink)var1.next();
            System.out.println(drink);
        }
    }
    public List<Drink> getDrinks() { return this.drinks; }
    public void sort(DrinkComparator comparator) {
        Collections.sort(this.drinks, comparator);
    }
}
