package ru.itmo.java.basics.lab4;
import java.util.Scanner;

public class SevenMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
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
