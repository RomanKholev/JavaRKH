package org.example.oop.Hw1;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, double price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return ("HotDrink " + "name='" + super.getName() + '\'' + ", price=" + super.getPrice() + ", volume=" + super.getVolume() + "temperature=" + temperature);
    }
    @Override
    public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof HotDrink)) {
                return false;
            }

            HotDrink that = (HotDrink) o;

            return super.getName().equalsIgnoreCase(that.getName())
                    && super.getPrice() == that.getPrice()
                    && getVolume() == that.getVolume();
        }
}
