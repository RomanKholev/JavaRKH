package org.example.oop.Hw3.Ex1;

import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class DrinkComparator implements Comparator<Drink> {
    private final String type;

public DrinkComparator(String type) {this.type = type; }
    public int compare(Drink o1, Drink o2) {
    switch (this.type) {
        case "wolume":
            return o1.getVolume().compareTo(o2.getVolume());
        case "price":
            return o1.getPrice().compareTo(o2.getPrice());
        default:
            return 0;
    }
    }
}
