package org.example.Hw4.Hw4Ex2;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст в скобках");
        String st = sc.nextLine();
        System.out.println(st + " " + isValid(st));

    }

    private static boolean isValid(String inputString) {
        char[] arr = inputString.toCharArray();
        Deque qu = new LinkedList();
        String open = "([{";
        for (Character ch : arr) {
            if (open.contains(ch.toString())) qu.add(ch);
            else if (qu.isEmpty()) return false;
            else if (ch.equals(']') && !qu.pollLast().equals('[')) return false;
            else if (ch.equals(')') && !qu.pollLast().equals('(')) return false;
            else if (ch.equals('}') && !qu.pollLast().equals('{')) return false;
        }
        return qu.isEmpty();
    }
}