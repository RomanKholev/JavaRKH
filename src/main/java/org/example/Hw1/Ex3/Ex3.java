package org.example.Hw1.Ex3;

import java.util.Scanner;

public class Ex3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа в двоичной системе счисления");
        String a = sc.nextLine();
        String b = sc.nextLine();
        int dexA = Integer.parseUnsignedInt(a, 2);
        int dexB = Integer.parseUnsignedInt(b, 2);
        int dexSum = dexA + dexB;
        String binSum = Integer.toBinaryString(dexSum);

        System.out.println(binSum);

    }
}