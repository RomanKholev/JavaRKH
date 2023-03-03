package org.example.Hw1.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа, введенный 0 - конец комбинации. ");
        int sum = 0;
        int a = sc.nextInt();
        while (a != 0) {
            int b = sc.nextInt();
            if (a > 0 && b < 0) {
                sum += a;
            }
            a = b;

        }
        System.out.println("Сумма = " + sum);
    }
}