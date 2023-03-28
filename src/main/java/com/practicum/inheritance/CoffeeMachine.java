package com.practicum.inheritance;

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

    public void makeCoffee(String coffeeName) {
        Coffee coffee;

        if (coffeeName.equals("Капучино")) {
            coffee = new Cappuccino();
        } else if (coffeeName.equals("Американо")) {
            coffee = new Americano();
        } else {
            System.out.println("Не могу приготовить " + coffeeName);
            return;
        }
        coffee.makeCoffee();
    }
}

abstract class Coffee {
    private final int milk;
    private final int beans;
    private final int water;

    Coffee(int milk, int beans, int water) {
        this.milk = milk;
        this.beans = beans;
        this.water = water;
    }

    void makeCoffee() {
        // TODO make coffee
        System.out.println("Готовлю кофе");
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

class Americano extends Coffee {
    Americano() {
        super(0, 10, 100);
    }
}

class Cappuccino extends Coffee {
    Cappuccino() {
        super(100, 10, 50);
    }
}
