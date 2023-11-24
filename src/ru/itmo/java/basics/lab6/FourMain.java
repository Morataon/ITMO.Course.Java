package ru.itmo.java.basics.lab6;

import java.util.Scanner;

public class FourMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int i = Integer.parseInt(scanner.nextLine());

        FourChild number = new FourChild(i);

        number.print();

    }

}
