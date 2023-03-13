package org.example.Hw3.HwEx3;

import org.example.Hw3.HwEx2.model.Goods;
import org.example.Hw3.HwEx3.model.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        Books books0 = new Books("Чудеса да и только", "Аристов", 110.2, 17, 2020);
        Books books1 = new Books("Рассказы  из прошлого", "Петров", 110.2, 18, 2012);
        Books books2 = new Books("Вечера близь леса", "Сидоров", 110.2, 200, 2020);
        Books books3 = new Books("Кто-то что-то написал", "Антонов", 110.2, 89, 2009);
        Books books4 = new Books("Книга №1", "Арбузов", 110.2, 83, 2010);
        Books books5 = new Books("Читают и ладно", "Неизвестный", 110.2, 17, 2020);

        List<Books> booksList = new ArrayList<>();
        booksList.add(books0);
        booksList.add(books1);
        booksList.add(books2);
        booksList.add(books3);
        booksList.add(books4);
        booksList.add(books5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искосмое слово: ");
        String searchName = scanner.nextLine();
        System.out.println("Год выпуска от: ");
        Integer searchMinYear = scanner.nextInt();
        List<String> names = new ArrayList<>();
        for (Books book : booksList) {
            if (book.getName().toLowerCase().contains(searchName.toLowerCase()) && book.getYear() >= searchMinYear && isSimple(book.getPages()) == true) {
                names.add(book.getName());
            }
        }
        System.out.println("Книги содежащие '" + searchName + "' в имени автора, начаная с " + searchMinYear + " года, с простык колличкством страниц: " + names);


    }

    public static boolean isSimple(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}