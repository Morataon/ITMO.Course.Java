package ru.itmo.java.basics.lab4;

import java.util.Scanner;

public class TenMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива целых чисел: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива (целые числа):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        firstUnique(array);
    }

    private static void firstUnique(int[] array) {
        boolean isExist = false;

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Первое уникальное число в массиве: " + array[i]);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("В массиве нет уникальных чисел");
        }
    }
}
