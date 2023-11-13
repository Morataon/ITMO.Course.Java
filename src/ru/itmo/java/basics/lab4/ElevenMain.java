package ru.itmo.java.basics.lab4;

import java.util.Scanner;

public class ElevenMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива целых чисел: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива (целые числа):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }


    }
}
