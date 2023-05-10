package com.practicum.buildstrings;

public class Main {
    public static void main(String[] args) {
        test1();
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

        for (int i =0; i < 100000; i++) {
            String text = "i = " + i;
        }

        long end = System.currentTimeMillis();

        System.out.println(end - begin);
    }
}
