package org.example.oop.Cw3.Ex2;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new StudentComparator());
    }
}
