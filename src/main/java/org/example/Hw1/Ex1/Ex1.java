package org.example.Hw1.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String str = scanner.nextLine();
        String res[] = str.split(" ");
        String str_inverted = new String();
        for (int i = 0; i < res.length; i++) {
            str_inverted = String.join(" ", str_inverted, res[res.length - 1 - i]);
        }
        str_inverted = str_inverted.trim();
        System.out.println("Резултат: " + str_inverted);
    }
}
