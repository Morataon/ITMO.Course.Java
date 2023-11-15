package ru.itmo.java.basics.lab5;

import java.util.Scanner;

public class OneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String word = longestWord(text);

        System.out.println("Самое длинное слово: " + word);
    }

    public static String longestWord(String text) {
        String[] words = text.split("\\s+"); // разделяем текст на слова по пробелам, таблуляциям и новым строкам
        String longestWord = "";

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Zа-яА-Я]", ""); // удаляем знаки препинания

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}