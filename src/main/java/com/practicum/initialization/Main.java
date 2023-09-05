package com.practicum.initialization;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Americano();

        System.out.println(coffee.milk);
    }
}

class Coffee {
    int milk;

    {
        System.out.println("Кто-то заказал кофе!");
    }

    Coffee() {
        System.out.println("Кофе");
        milk = 0;
    }

}

class Americano extends Coffee {

    {
        System.out.println("Кто-то заказал Американо!");
    }

    Americano() {
        System.out.println("Американо");
        milk = 40;
    }

    Americano(int milk) {
        System.out.println("Американо с молоком");

        this.milk = milk;
    }
}
