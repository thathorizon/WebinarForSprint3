package com.practicum.buildstrings;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin");
        test2();
        System.out.println("End");
    }

    public static void test1() {
        long begin = System.currentTimeMillis();

        StringBuilder text = new StringBuilder();
        for (int i =0; i < 100000; i++) {
            text.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - begin);
    }

    public static void test2() {
        long begin = System.currentTimeMillis();

        String text ="";
        for (int i =0; i < 100000; i++) {
            text +=  i;
        }

        long end = System.currentTimeMillis();

        System.out.println(end - begin);
    }
}
