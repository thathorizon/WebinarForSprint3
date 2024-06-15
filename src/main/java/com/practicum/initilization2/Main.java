package com.practicum.initilization2;

abstract class Animal {
    protected abstract String getName();

    private final String description;

    protected Animal() {
        description = "Animal name is " + getName();
    }

    public String getDescription() {
        return description;
    }
}

class Dog extends Animal {
    private String name = "Dog";

    protected String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        System.out.println(animal.getDescription());
    }
}