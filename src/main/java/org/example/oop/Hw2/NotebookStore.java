package org.example.oop.Hw2;


import java.util.ArrayList;

public class NotebookStore implements Store{
    private final ArrayList<Notebook> goods;

    public NotebookStore(ArrayList<Notebook> goods) {
        this.goods = goods;
    }
    public Goods getProduct(String name){
        for(Goods goods : this.goods){
            if(goods.getName().equalsIgnoreCase(name)){
                return goods;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public Notebook getNotebook(String name, int diskSize){
        for(Goods goods : this.goods) {
            if (goods instanceof Notebook) {
                if (goods.getName().equalsIgnoreCase(name) && ((Notebook) goods).getDiskSize() == diskSize) {
                    return (Notebook) goods;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
        }
}