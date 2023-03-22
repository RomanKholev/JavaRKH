package org.example.Cw6.Ex4.model;

public class Kelvin implements Converter {
    @Override
    public Double convert(Double inputValue) {
        return inputValue + 273.15;
    }

}
