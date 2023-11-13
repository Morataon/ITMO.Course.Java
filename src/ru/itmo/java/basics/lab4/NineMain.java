package ru.itmo.java.basics.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class NineMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива целых чисел: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива (целые числа):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(array));

        firstLast(array);

        System.out.println("Array 2: " + Arrays.toString(array));
    }

    private static void firstLast(int[] array) {
        if (array.length >= 2) {
            int first = array[0];
            int last = array[array.length - 1];
            array[0] = last;
            array[array.length - 1] = first;
        } else System.out.println("Невозможно поменять местами элементы в массиве, состоящем из 1 элемента");
    }
}
