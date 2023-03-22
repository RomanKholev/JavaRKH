package org.example.Hw5.Hw5Ex1;
/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HwEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inputString = sc.nextLine().toLowerCase();
        Map<String, Integer> count = countWords(inputString);
        for (var entry : count.entrySet()) {
            System.out.println(entry.getKey() + " встретилось - " + entry.getValue() + " раз");
        }

    }

    private static Map<String, Integer> countWords(String inputString) {
        Map<String, Integer> count = new HashMap<>();
        for (String longWord : inputString.split(" ")) {
            String word = longWord.replaceAll("[^А-Яа-яЁё]", "");
            if (word.isEmpty()) continue;
            Integer item = count.get(word);
            if (item == null) item = 0;
            count.put(word, ++item);
        }
        return count;
    }

}