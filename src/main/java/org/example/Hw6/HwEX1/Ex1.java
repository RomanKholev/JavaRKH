package org.example.Hw6.HwEX1;

import org.example.Hw6.HwEX1.Model.Notebook;
import org.example.Hw6.HwEX1.Model.UserFilter;

import java.util.HashSet;
import java.util.Set;


/**
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
 * и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
 * фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Ex1 {
    public static void main(String[] args) {
        Set<Notebook> base = new HashSet<>();
        base.add(new Notebook("Asus", 16, 256, "windows", "red"));
        base.add(new Notebook("Asus", 32, 512, "windows", "black"));
        base.add(new Notebook("Asus", 64, 1024, "windows", "green"));
        base.add(new Notebook("Acer", 16, 256, "windows", "silver"));
        base.add(new Notebook("Acer", 32, 512, "windows", "grey"));
        base.add(new Notebook("Acer", 64, 1024, "windows", "white"));
        base.add(new Notebook("Lenova", 16, 256, "windows", "black"));
        base.add(new Notebook("Lenova", 32, 512, "windows", "gray"));
        base.add(new Notebook("Lenova", 64, 1024, "windows", "white"));
        base.add(new Notebook("Asus", 16, 256, "linux", "red"));
        base.add(new Notebook("Asus", 32, 512, "linux", "black"));
        base.add(new Notebook("Asus", 64, 1024, "linux", "green"));
        base.add(new Notebook("Acer", 16, 256, "linux", "silver"));
        base.add(new Notebook("Acer", 32, 512, "linux", "grey"));
        base.add(new Notebook("Acer", 64, 1024, "linux", "white"));
        base.add(new Notebook("Lenova", 16, 256, "linux", "black"));
        base.add(new Notebook("Lenova", 32, 512, "linux", "gray"));
        base.add(new Notebook("Lenova", 64, 1024, "linux", "white"));
        base.add(new Notebook("HP", 16, 256, "linux", "black"));
        base.add(new Notebook("HP", 32, 512, "linux", "gray"));
        base.add(new Notebook("HP", 64, 1024, "linux", "white"));


        UserFilter filter = new UserFilter(base);
        while (filter.isUserHere()) {
            filter.askFilter();
        }
    }


}