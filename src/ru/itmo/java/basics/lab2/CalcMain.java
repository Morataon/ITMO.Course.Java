package ru.itmo.java.basics.lab2;

import java.time.LocalDate;

public class CalcMain {

    public static void main(String[] args) {
        CalcMethods calculator = new CalcMethods();

        // Пример использования
        double resultDouble = calculator.add(5.5, 2.5);
        long resultLong = calculator.subtract(10L, 3L);
        int resultInt = calculator.multiply(7, 4);

        System.out.println("Результат сложения (double): " + resultDouble);
        System.out.println("Результат вычитания (long): " + resultLong);
        System.out.println("Результат умножения (int): " + resultInt);
    }
}