package ru.itmo.java.basics.lab4;

import java.util.Scanner;

public class FiveMain {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.print("В массиве 5 элементов\n");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            numbers[i] = scanner.nextInt();
        }
        check(numbers);
    }

    private static void check(int[] array) {
        System.out.print("array = ");
        for (int i : array) {
            System.out.print(i + ", ");
        }

        if (array[0] == 3 || array[4] == 3) {
            System.out.println("\ntrue");
        } else System.out.println("\nfalse");
    }
}
