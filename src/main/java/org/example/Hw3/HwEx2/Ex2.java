package org.example.Hw3.HwEx2;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
 */

import org.example.Hw3.HwEx2.model.Goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args) {
        Goods goods0 = new Goods("Ветчина высший сорт", "Россия", 599.0, 0.675, 2);
        Goods goods1 = new Goods("Колбаса", "Белорусь", 400.20, 0.9, 2);
        Goods goods2 = new Goods("Бананы", "Бразилия", 99.0, 1.60, 2);
        Goods goods3 = new Goods("Яблоки ", "Польша", 102.30, 3.00, 2);
        Goods goods4 = new Goods("Тушонка высший сорт", "Россия", 250.00, 0.5, 1);
        Goods goods5 = new Goods("Гречка", "Россия", 99.0, 1.00, 2);

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(goods0);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        goodsList.add(goods5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомый сорт: ");
        Integer searchGrade = scanner.nextInt();
        double minPrice = Double.MAX_VALUE;
        for (Goods goods : goodsList) {
            if (goods.getGrade() == searchGrade) {
                if (minPrice > goods.getPrice()) {
                    minPrice = goods.getPrice();
                }
            }
        }

        List<String> names = new ArrayList<>();
        for (Goods goods : goodsList) {
            if (goods.getGrade() == searchGrade && goods.getPrice() == minPrice) {
                names.add(goods.getName());
            }
        }
        System.out.println("Товары " + searchGrade + " сорта с минимальной ценой: " + names);

    }
}