package org.example.HW2.Hw2Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("Последовательность возрастающая = " + isAscendingSequence());

    }

    /**
     * @return true/false возрастающая последовательности из n чисел
     */
    public static boolean isAscendingSequence() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.printf("Введите длинну последовательности: ");
        int n = scanner.nextInt();
        System.out.printf("Введите 1 число: ");
        int firstNum = scanner.nextInt();
        //boolean flag = true;
        for (int i = 1; i < n; i++) {
            System.out.printf("Введите " + (i + 1) + " число: ");
            int secondNum = scanner.nextInt();
            if (secondNum >= firstNum) {
                //flag = true;

            } else {
                return false;
            }
            firstNum = secondNum;
        }

        return true;
    }

}

