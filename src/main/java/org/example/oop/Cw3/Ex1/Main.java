package org.example.oop.Cw3.Ex1;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShelter cats = new CatShelter(List.of(new Cat("name1")));
        Iterator<Cat> iterator34 = cats.iterator();
        cats.getSize();
        if (iterator34.hasNext()){
            cats.getCats().get(0);

            System.out.println(iterator34.next());

        }
    }

}
