package org.example.Cw6.Ex1;

import java.util.*;
//1)Дан массив чисел, посчитать процент уникальных чисел.

public class Ex1 {
    public static void main (String [] args) {
        List<Integer> arrey = new ArrayList<>(Arrays.asList(1,2,3,1));
        Set<Integer> set = new HashSet<>(arrey);
        double pr = set.size()*100/ arrey.size();

        System.out.println(pr);
    }
}
