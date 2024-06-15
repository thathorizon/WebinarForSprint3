package com.practicum.trycatch;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin");

//        getAndPrintInt();

        try {
            sleep(0);
        } catch (Exception e) {
            System.out.println("Поймал исключение " + e);

        }

        System.out.println("End");

    }

    public static void getAndPrintInt() {
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();
            System.out.println("Вы ввели с клавиатуры: " + value);

        } catch (InputMismatchException e) {
            System.out.println("Введено не число!");
//            System.out.println(ime);

        } finally {
            System.out.println("Мы попали в finally!");
            scanner.close();
        }
    }

    public static int whatsFinallyReturned() {
        try {
            return 0;
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void sleep(int second) throws InterruptedException {
        if (second == 0 ) {
            throw new NullPointerException();
        }

//        try {
            Thread.sleep(second * 1000l);
//        } catch (InterruptedException e) {
//
//        }
    }
}
