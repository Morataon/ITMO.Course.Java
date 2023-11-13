package ru.itmo.java.basics.lab4;
import java.util.Scanner;

public class FiveMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        check(numbers);
    }

    private static void check(int[] array) {
        System.out.print("array = ");
        for (int i : array) {
            System.out.print(i + ", ");
        }

        if (array[0] == 3 || array[array.length - 1] == 3) {
            System.out.println("\ntrue");
        } else System.out.println("\nfalse");
    }
}
