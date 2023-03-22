package org.example.Hw5.Hw5Ex2;
/**
 * 2) Подсчитать количество искомого слова, через map (наполнением значение,
 * где искомое слово будет являться ключом), вносить все слова не нужно
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HwEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inputString = sc.nextLine().toLowerCase();
        System.out.println("Введите искомое слово: ");
        String searchWord = sc.nextLine().toLowerCase();
        Integer count = searchWord(inputString, searchWord);
        System.out.println(searchWord + " встретилось " + count + " раз");

    }

    private static Integer searchWord(String inputString, String searchWord) {
        Map<String, Integer> count = new HashMap<>();
        for (String longWord : inputString.split(" ")) {
            String word = longWord.replaceAll("[^А-Яа-яЁё]", "");
            if (word.equals(searchWord)) {
                Integer item = count.get(word);
                if (item == null) item = 0;
                count.put(word, ++item);
            }
        }
        return count.get(searchWord);
    }
}

