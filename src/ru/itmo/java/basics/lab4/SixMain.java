package ru.itmo.java.basics.lab4;
import java.util.Scanner;

public class SixMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("array = ");
        for (int i : numbers) {
            System.out.print(i + ", ");
        }

        if (check(numbers)) {
            System.out.println("\nМассив содержит число 1 или 3");
        } else {
            System.out.println("\nМассив не содержит число 1 или 3");
        }
    }

    private static boolean check(int[] array) {
        for (int i : array) {
            if (i == 1 || i == 3) {
                return true;
            }
        }
        return false;
    }
}
