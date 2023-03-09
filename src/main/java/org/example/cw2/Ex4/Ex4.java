package org.example.cw2.Ex4;


import org.example.cw2.Ex4.model.Vector;

public class Ex4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0 ,1.0);
        Vector vector2 = new Vector(1.0, 2.0 ,3.0);

        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длинна вектора 1 = "+ vector1.lanthsVecotr());
        System.out.println("Длинна вектора 2 = "+ vector2.lanthsVecotr());
        System.out.println("Скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("Векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("Косинус угла = " + vector1.cosVector(vector2));
        System.out.println("Сумма веторов = " + vector1.sunVector(vector2));
        System.out.println("Разница веторов = " + vector1.sunVector(vector2));

    }

}
