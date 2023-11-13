package ru.itmo.java.basics.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class EightMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
