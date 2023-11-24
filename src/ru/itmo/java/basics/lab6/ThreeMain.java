package ru.itmo.java.basics.lab6;

import java.util.Scanner;

public class ThreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите параметры грузовика:");
        System.out.print("Вес: ");
        int weight = Integer.parseInt(scanner.nextLine());
        System.out.print("Модель: ");
        String model = scanner.nextLine();
        System.out.print("Цвет (один символ): ");
        char color = scanner.nextLine().charAt(0);
        System.out.print("Скорость грузовика: ");
        float speed = Float.parseFloat(scanner.nextLine());
        System.out.print("Количество колес грузовика: ");
        int weelsQuantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Максимальный вес грузовика: ");
        double maxWeight = Double.parseDouble(scanner.nextLine());

        ThreeTruk truk = new ThreeTruk(weight, model, color, speed, weelsQuantity, maxWeight);
        truk.outPut();

        System.out.print("Введите новое количество колес для грузовика: ");
        int newWeelsQuantity = Integer.parseInt(scanner.nextLine());
        truk.newWeels(newWeelsQuantity);
    }
}
