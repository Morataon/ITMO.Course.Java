package ru.itmo.java.basics.lab2;

import java.time.LocalDate;

public class CalcMain {

    public static void main(String[] args) {
        CalcMethods calculator = new CalcMethods();

        // Пример использования
        double resultDouble = calculator.add(5.5, 2.5);
        long resultLong = calculator.subtract(10L, 3L);
        int resultInt = calculator.multiply(7, 4);
        double resultInt1 = calculator.divide(10,3);
        double resultLong1 = calculator.divide(10L, 3L);

        System.out.println("Результат сложения (double): " + resultDouble);
        System.out.println("Результат вычитания (long): " + resultLong + "L");
        System.out.println("Результат умножения (int): " + resultInt);
        System.out.println("Результат деления (int): " + resultInt1);
        System.out.println("Результат деления (long): " + resultLong1 + "L");
    }
}