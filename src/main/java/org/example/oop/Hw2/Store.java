package org.example.oop.Hw2;



public interface Store {
    Goods getProduct(String name) throws IllegalStateException;
}
