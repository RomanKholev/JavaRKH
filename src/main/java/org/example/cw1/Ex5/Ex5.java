package org.example.cw1.Ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Введите количество чисел: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 1; i < n+1; i++) {
            arr[i-1] = i;
        }
        int [] res = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= i+1; j++) {

                res[i] +=j;

            }
            System.out.println(res[i]);
        }

        }

    }

