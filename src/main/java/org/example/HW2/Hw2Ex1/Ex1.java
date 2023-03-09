package org.example.HW2.Hw2Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println("Сумма простых чисел = " + simpleNumSun());

    }

    /**
     * @return сумма простых чисел во введенной последовательности из n чисел
     */
    public static int simpleNumSun() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.printf("Введите длинну последовательности: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите " + (i + 1) + " число: ");
            int num = scanner.nextInt();
            if (isSimple(num) == true) {
                sum += num;
            }
        }
        return sum;
    }

    /**
     * @param number - входящее число
     * @return true/false простое число
     */
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




