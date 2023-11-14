package ru.itmo.java.basics.lab5;

import java.util.Scanner;

public class FiveMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String invertedText = invertWords(text);
        System.out.println("Все слова в строке инвертированы: " + invertedText);
    }

    private static String invertWords(String text) { // работаем со строкой
        String[] words = text.split("\\s+"); // разбиваем строку на слова

        for (int i = 0; i < words.length; i++) {  // применяем метод инверсии для каждого слова
            words[i] = invertWord(words[i]);
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {   // собираем строку из инверстированных слов
            result.append(word).append(" ");
        }

        return result.toString().trim();  // удаляем последний пробел
    }

    private static String invertWord(String word) {     // инвертируем каждое слова
        char[] letters = word.toCharArray();
        int first = 0;
        int last = letters.length - 1;

        while (first < last) { //    меняем местами буквы в слове
            char first1 = letters[first];
            letters[first] = letters[last];
            letters[last] = first1;

            first++;
            last--;
        }

        return new String(letters);
    }
}
