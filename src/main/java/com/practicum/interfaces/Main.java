package com.practicum.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.doWork(new ConsoleLogger());
    }
}

interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String string) {
        // write to file
    }

    private void openFile() {

    }
}

class MultiLogger implements Logger {
    List<Logger> loggers;

    MultiLogger(List<Logger> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void log(String message) {
        for (Logger logger : loggers) {
            logger.log(message);
        }
    }
}

class Worker {
    public void doWork(Logger logger) {
        logger.log("Начинаю работу!");
    }
}