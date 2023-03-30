package org.example.oop.Cw1.Ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
 *
 * Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и
 * реализовать класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтома
 *
 * создать перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным входным параметром (пример: getProduct(String name)
 * выдающий товар по имени, создать метод возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume) (10 минут)
 */
public class main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList();
        list.add(new BottleOfWater("water 0.5l", 300.0, 300));
        list.add(new BottleOfWater("water 1l", 200.0, 200));
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(list);
//        list.add(new Water("water 1l", 100.0, 2));
//        machine.addProduct(new Chocolate("mars", 200.0));

        BottleOfWater water = machine.getProduct("water 0.5l", 300);

        //ArrayList list = machine.getProductByName("water");
        System.out.println(machine.getProduct("water 0.5l", 300));

//        ArrayList list2 = machine.getProduct("");
//        System.out.println(list2);
//
//        Machine machine2 = new VendingMachine();
    }
}


