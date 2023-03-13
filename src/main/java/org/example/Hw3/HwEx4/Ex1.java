package org.example.Hw3.HwEx4;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        String[] arr = {"1", "2", "3"};
        int count = fuctorial(arr.length);
        int max = arr.length - 1;
        System.out.println("Вариантов " + count);
        int shift = max;
        String temp;
        while (count > 0) {
            temp = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = temp;
            print(arr);
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
    }

    static void print(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
}
}
