package ru.itmo.java.basics.lab5;

import java.util.Scanner;

public class TwoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        if (isPalindrom(word)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }

    public static boolean isPalindrom(String word) {
        word = word.replaceAll("\\s+", ""); // удаляем пробелы
        word = word.replaceAll("[^a-zA-Zа-яА-Я]", ""); // удаляем знаки препинания (чтобы проверять фразы)
        word = word.toLowerCase(); // делаем все буквы строчными

        int length = word.length();
        for (int i = 0; i < length / 2; i++) { // цикл до половины длины строки, если букв неч кол-во, то центральную не сравниваем
            if (word.charAt(i) != word.charAt(length - 1 - i)) { // сравниваем буквы с обоих концов строки, идём к центру
                return false;
            }
        }
        return true;
    }
}
