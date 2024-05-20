package com.practicum.buildstrings;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin");

        test2();

        System.out.println("End");
    }

    public static void test() {
        long begin = System.currentTimeMillis();

        String test = "";
        for (int i = 0; i < 500000; i++) { // 500_000
            test += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    public static void test2() {
        long begin = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 500000; i++) { // 500_000
            builder.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
