package org.example.Cw6.Ex4;

import org.example.Cw6.Ex4.model.Celsuis;
import org.example.Cw6.Ex4.model.Farenheit;
import org.example.Cw6.Ex4.model.Kelvin;

/**
 * Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса, для валидного перевода величин. Метод для конвертации назовите "convertValue".
 */
public class Ex4 {
    public static void main(String[] args){
        Double tCelsium = 36.6;
        Double tFareheit = new Farenheit().convert(tCelsium);
        Double tKelvin = new Kelvin().convert(tCelsium);
        Double tCelsium2 = new Celsuis().convert(tCelsium);
        System.out.println(tCelsium);
        System.out.println(tFareheit);
        System.out.println(tKelvin);
        System.out.println(tCelsium2);




    }
}
