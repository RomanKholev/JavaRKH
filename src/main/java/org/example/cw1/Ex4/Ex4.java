
package org.example.cw1.Ex4;

import java.util.Scanner;

public class Ex4{
        public static void main(String[] args){

            Scanner sc= new Scanner(System.in);
            System.out.printf("Введите количество чисел: ");
            int n = sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < arr.length /2 ; i++) {
                if (arr[i] != arr[arr.length-i-1]) {
                    flag = false;

                }

            }
            System.out.println(flag);
        }

}