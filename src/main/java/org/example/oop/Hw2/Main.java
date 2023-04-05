package org.example.oop.Hw2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notebook> base = new ArrayList<>();
        base.add(new Notebook("Asus",123.1, 16, 256, "windows", "red"));
        base.add(new Notebook("Asus",154.3,  32, 512, "windows", "black"));
        base.add(new Notebook("Asus",234.0, 64, 1024, "windows", "green"));
        base.add(new Notebook("Acer",231.0, 16, 256, "windows", "silver"));
        base.add(new Notebook("Acer",200.1, 32, 512, "windows", "grey"));
        base.add(new Notebook("Acer",210.0 ,64, 1024, "windows", "white"));
        base.add(new Notebook("Lenova",300.0,  16, 256, "windows", "black"));
        base.add(new Notebook("Lenova",230.0, 32, 512, "windows", "gray"));
        base.add(new Notebook("Lenova",250.1, 64, 1024, "windows", "white"));
        NotebookStore store = new NotebookStore(base);
        System.out.println(store.getNotebook("Asus", 256));


    }
}
