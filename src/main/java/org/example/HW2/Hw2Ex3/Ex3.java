package org.example.HW2.Hw2Ex3;


import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите количество чисел массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int indexSum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите " + (i+1) + " Число: ");
            arr[i] = sc.nextInt();
            if (arr[i] < 100 && arr[i] > 9) {
                indexSum +=i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(relaseNegative(arr, indexSum)));
    }

    /**
     *
     * @param arr Входящий массв
     * @param indexSum число для замены отрицательных ччисел массива
     * @return масив с заменными отрицательными числами
     */
    public static int[] relaseNegative (int [] arr, int indexSum) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < 0) {
               arr[i] = indexSum;
            }
        }
        return arr;
    }
}
