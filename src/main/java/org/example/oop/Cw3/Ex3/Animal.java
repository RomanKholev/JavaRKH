package org.example.oop.Cw3.Ex3;

public abstract class Animal {
    private Integer age;
    private Integer weight;
    private String name;

    public Animal(Integer age, Integer weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal{name='" + this.name + "'}";
    }
}