package ru.itmo.java.basics.lab4;
import java.util.Scanner;

public class SevenMain {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.print("В массиве 5 элементов\n");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            numbers[i] = scanner.nextInt();
        }

        if (isSorted(numbers)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    private static boolean isSorted(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
