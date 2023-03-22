package org.example.Cw6.Ex4.model;

public class Farenheit implements Converter{
    @Override
    public Double convert(Double inputValue) {
        return inputValue *9/5 + 32;
    }
}
