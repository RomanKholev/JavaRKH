package org.example.cw1.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("result = "+ (subtractProductsAndSum(n)));
    }

    public static int subtractProductsAndSum(int n) {
        int sum=0, multi = 1;
            while (n!=0) {
                sum += n % 10;
                multi *= n % 10;
                n /= 10;
            }
        return multi - sum;

    }
}
