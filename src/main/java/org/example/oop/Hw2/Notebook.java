package org.example.oop.Hw2;

public class Notebook  extends Goods {
    public Integer ramSize;
    public Integer diskSize;
    public String osName;

    @Override
    public String toString() {
        return "Name= " + super.getName() +
                "price= " + super.getPrice() +
                "ramSize=" + ramSize +
                ", diskSize=" + diskSize +
                ", osName='" + osName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String color;

    public Notebook(String name, double price) {
        super(name, price);
    }

    public Notebook(String name, double price, Integer ramSize, Integer diskSize, String osName, String color) {
        super(name, price);
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.osName = osName;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Notebook)) {
            return false;
        }

        Notebook that = (Notebook) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getPrice() == that.getPrice()
                && getDiskSize() == that.getDiskSize()
                && getRamSize() == that.getRamSize()
                && getColor() == that.getColor()
                && getOsName() == that.getOsName();

    }
}

