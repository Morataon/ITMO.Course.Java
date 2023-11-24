package ru.itmo.java.basics.lab6;

import java.util.Scanner;

public class FiveParent {
    public Scanner scanner;

    public FiveParent() {
        scanner = new Scanner(System.in);
    }

    public int getInfo() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }
}
