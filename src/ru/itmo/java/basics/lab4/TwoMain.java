package ru.itmo.java.basics.lab4;

public class TwoMain {
    public static void main(String[] args) {
        System.out.println("Делится на 3:");
        three();
        System.out.println("\nДелится на 5:");
        five();
        System.out.println("\nДелится на 3 и на 5:");
        threeAndFive();
    }

    private static void three() {
        for (int i = 1; i <= 100; i += 1) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void five() {
        for (int i = 1; i <= 100; i += 1) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void threeAndFive() {
        for (int i = 1; i <= 100; i += 1) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}