package ru.itmo.java.basics.lab2;

public class CalcMethods {
    // Метод для суммы
    public double add(double a, double b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    // Метод для деления
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return a / b;
    }

    public double divide(long a, long b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return (double) a / b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return (double) a / b;
    }

    // Метод для умножения
    public double multiply(double a, double b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // Метод для вычитания
    public double subtract(double a, double b) {
        return a - b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}


