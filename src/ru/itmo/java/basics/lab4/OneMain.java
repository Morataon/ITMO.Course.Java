package ru.itmo.java.basics.lab4;

public class OneMain {
    public static void main(String[] args) {
        calculations();
    }

    private static void calculations() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }
}
