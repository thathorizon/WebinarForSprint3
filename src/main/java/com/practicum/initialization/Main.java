package com.practicum.initialization;

public class Main {
    public static void main(String[] args) {
        Coffee americano = new Americano();
        System.out.println(americano.milk);

    }
}

class Coffee {
    public static String name = "Кофе";

    int milk;
    int beans;
    int water;

    Coffee() {
        milk = 20;
    }


}

class Americano extends Coffee {
    public static String name = "Американо";

    Americano() {
        milk = 40;
    }
}

