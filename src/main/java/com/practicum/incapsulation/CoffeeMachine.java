package com.practicum.incapsulation;

public class CoffeeMachine {
    private int milk;
    private int beans;
    private int water;

    public void printStatus() {
        System.out.println("Ингридиентов осталось:");
        System.out.println(water + " мл. воды");
        System.out.println(milk + " мл. молока");
        System.out.println(beans + " гр. кофе");
    }

    public boolean isIngredientsEnough(Coffee coffee) {
        if (water < coffee.getWater()) {
            System.out.println("Недостаточно воды!");
            return false;
        }

        if (milk < coffee.getMilk()) {
            System.out.println("Недостаточно молока!");
            return false;
        }

        if (beans < coffee.getBeans()) {
            System.out.println("Недостаточно кофе!");
            return false;
        }

        return true;
    }
}

class Coffee {
    private final int milk;
    private final int beans;
    private final int water;

    Coffee(int milk, int beans, int water) {
        this.milk = milk;
        this.beans = beans;
        this.water = water;
    }


    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getWater() {
        return water;
    }
}
