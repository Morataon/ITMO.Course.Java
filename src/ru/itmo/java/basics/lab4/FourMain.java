package ru.itmo.java.basics.lab4;

import java.util.Scanner;

public class FourMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье целое число: ");
        int num3 = scanner.nextInt();

        boolean result = checkSum(num1, num2, num3);
        System.out.println("Результат: " + result);
    }

    private static boolean checkSum(int a, int b, int c) {
        if (a < b && b < c) {
            return true;
        } else return false;
    }
}
