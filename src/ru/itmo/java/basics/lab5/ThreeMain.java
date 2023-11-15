package ru.itmo.java.basics.lab5;

import java.util.Scanner;

public class ThreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите фразу или слово, которое нужно скрыть цензурой:");
        String censoredText = scanner.nextLine();

        String censoredFinishText = censoredWords(text, censoredText);

        System.out.println("Текст после цензуры:\n" + censoredFinishText);
    }

    private static String censoredWords(String text, String sensoredText) {
        String sensored = sensoredText;
        text = text.replaceAll("\\b" + sensored + "\\b", "[вырезано цензурой]"); // \b чтобы считывалось отдельное слово, а не как часть другого слова
        return text;
    }
}
