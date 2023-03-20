package org.example.Hw4.Hw4Ex1;

import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList inputList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) inputList.add(i);

        System.out.println(inputList);
        LinkedList revers = reverseList(inputList);
        System.out.println(revers);
    }

    private static LinkedList reverseList(LinkedList inputList) {
        LinkedList result = new LinkedList();
        while (inputList.size() > 0) {
            result.addFirst(inputList.pop());
        }
        return result;
    }


}

