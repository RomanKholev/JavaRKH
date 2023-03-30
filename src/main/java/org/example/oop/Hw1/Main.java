package org.example.oop.Hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        List<Drink> list = new ArrayList<>();
        list.add(new HotDrink("Кофе", 300.0, 0.3, 99));
        list.add(new HotDrink("Холодный кофе", 299.0, 0.33, 10));
        list.add(new HotDrink("Чай", 100.0, 0.4, 98));
        list.add(new HotDrink("Холодный чай", 150.0, 1.0, 10));
        list.add(new HotDrink("Горячая вода", 50.0, 0.5, 100));
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(list);
        System.out.println(machine.getDink("Кофе", 0.3, 99));




    }
}