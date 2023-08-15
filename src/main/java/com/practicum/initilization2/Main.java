package com.practicum.initilization2;
abstract class Animal {
    private final String fullName;

    protected Animal() {
        fullName = "Animal name is " + getName();
    }

    public String getFullName() {
        return fullName;
    }

    protected abstract String getName();
}

class Dog extends Animal {
    private String thisName = "Dog";

    protected String getName() {
        return thisName;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.getFullName());
    }
}