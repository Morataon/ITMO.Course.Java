package ru.itmo.java.basics.lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    static void task1() {
        System.out.println("Я\nхорошо\nзнаю\nJava");
    }
    static void task2() {
        double result1 = (46 + 10) * (10.0 / 3.0);
        int result2 = 29 * 4 * -15;
        System.out.println(result1);
        System.out.println(result2);
    }

    static void task3() {
        int number = 10500;
        int result = (number/10)/10;
        System.out.println(result);
    }

    static void task4() {
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result = a*b*c;
        System.out.println(result);
    }

    static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 42\n");
        int num1 = scanner.nextInt();
        System.out.println(num1);
        System.out.print("Введите число 100\n");
        int num2 = scanner.nextInt();
        System.out.println(num2);
        System.out.print("Введите число 125\n");
        int num3 = scanner.nextInt();
        System.out.println(num3);
    }

    static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if ((b % 2) == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if ((b % 2) == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
