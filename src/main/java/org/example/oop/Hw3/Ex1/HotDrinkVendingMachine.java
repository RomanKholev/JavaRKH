package org.example.oop.Hw3.Ex1;

import java.util.List;

public class HotDrinkVendingMachine implements Machine {
    private final List<Drink> drinks;

    public HotDrinkVendingMachine(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public Drink getDrink(String name) {
        for (Drink drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name)) {
                return drink;
            }
        }
        throw new IllegalStateException(String.format("Напиток c названием %s не найден.", name));
    }

    public HotDrink getDink(String name, double volume, int temperature) {
        for (Drink drink : drinks) {
            if (drink instanceof HotDrink) {
                if (drink.getName().equalsIgnoreCase(name) && (drink.getVolume() == volume) && ((HotDrink) drink).getTemperature() == temperature) {
                    return (HotDrink) drink;
                }
            }
        }
        throw new IllegalStateException(String.format("Напиток c названием %s не найден.", name));
    }
}