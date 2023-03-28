package com.practicum.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}

class ExceptionHandling {

    static public void getAndPrintInteger() {
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();
            System.out.println("Вы ввели с клавиатуры " + value);
        } catch (InputMismatchException ime) {
            System.out.println("Не правильный ввод!");
        } finally {
            System.out.println("Мы в блоке finally");
            scanner.close();
        }
    }

    static public void sleep(int seconds) throws InterruptedException {
        if (seconds == 0) throw new NullPointerException();
        Thread.sleep(seconds * 1000L);
    }

    static public int whatsFinallyReturned() {
        try {
            return 0;
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;
        }
    }
}