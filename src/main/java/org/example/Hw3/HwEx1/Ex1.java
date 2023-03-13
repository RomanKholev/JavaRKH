package org.example.Hw3.HwEx1;
/**
 * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */

import org.example.Hw3.HwEx1.model.Goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Goods goods0 = new Goods("Ветчина высший сорт", 521.29, 2);
        Goods goods1 = new Goods("Колбаса", 422.21, 2);
        Goods goods2 = new Goods("Бананы", 89.20, 3);
        Goods goods3 = new Goods("Яблоки ", 100.00, 2);
        Goods goods4 = new Goods("Тушонка высший сорт", 140.54, 1);
        Goods goods5 = new Goods("Гречка", 99.99, 2);

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(goods0);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        goodsList.add(goods5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искосмое слово: ");
        String searchName = scanner.nextLine();
        System.out.println("Введите первый искосмый сорт: ");
        Integer searchGrade1 = scanner.nextInt();
        System.out.println("Введите второй искосмый сорт: ");
        Integer searchGrade2 = scanner.nextInt();
        double maxPrice = 0;

        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getName().toLowerCase().contains(searchName.toLowerCase()) && goodsList.get(i).getGrade() == searchGrade1 || goodsList.get(i).getGrade()==searchGrade2) {
                if (goodsList.get(i).getPrise() > maxPrice) {
                    maxPrice  = goodsList.get(i).getPrise();
                }
            }

        }
        System.out.println("Максимальная стоимость = "+ maxPrice);
    }
}