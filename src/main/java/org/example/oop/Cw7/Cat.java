package org.example.oop.Cw7;

public class Cat {
    private String name;
    private int age;
    private Boolean isInGoodMode;

    public Cat(String name, int age, Boolean isInGoodMode) {
        this.name = name;
        this.age = age;
        this.isInGoodMode = isInGoodMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getInGoodMode() {
        return isInGoodMode;
    }

    public void setInGoodMode(Boolean inGoodMode) {
        isInGoodMode = inGoodMode;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isInGoodMode=" + isInGoodMode +
                '}';
    }
}
