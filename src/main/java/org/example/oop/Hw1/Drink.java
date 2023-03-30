package org.example.oop.Hw1;

public abstract class Drink {
    private String name;
    private Double price;
    private Double volume;

    public Drink(String name, Double price, Double volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getVolume() {
        return volume;
    }
    public void setVolume(Double volume) {
        this.volume = volume;

}
    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }
}