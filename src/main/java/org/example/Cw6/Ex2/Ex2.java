package org.example.Cw6.Ex2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Найти пересечение двух множеств
public class Ex2 {
    public static void main (String [] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5,6));
        Set<Integer> cross = new HashSet<>(s1);
        cross.retainAll(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(cross);

    }


}
