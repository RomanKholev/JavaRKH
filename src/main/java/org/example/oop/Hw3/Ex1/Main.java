package org.example.oop.Hw3.Ex1;



public class Main {
    public static void main(String[] args) {
     CoffeeBase base = new CoffeeBase();
        for (int i = 0; i <10; i++) {
            if (i%2 == 0) {
                base.addDrink(new Coffee("Кофе" +i, i*15.0, i*0.1));
            }
            else {
                base.addDrink(new Tea("Чай" +i, i*10.0, i*0.15));
            }
        }
base.print();
        base.sort(new DrinkComparator("volume"));
        System.out.println(" ");
        base.print();
        System.out.println(" ");


    }
}