package ru.itmo.java.basics.lab5;

import java.util.Scanner;

public class ThreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String censoredText = byaka(text);

        System.out.println("Текст после цензуры:\n" + censoredText);
    }

    private static String byaka(String text) {
        text = text.replaceAll("\\bбяка\\b", "[вырезано цензурой]"); // \b чтобы считывалось отдельное слово, а не как часть другого слова
        return text;
    }
}
