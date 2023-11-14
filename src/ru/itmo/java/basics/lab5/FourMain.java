package ru.itmo.java.basics.lab5;

import java.util.Scanner;

public class FourMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим строки от пользователя
        System.out.print("Введите основной текст: ");
        String string = scanner.nextLine();

        System.out.print("Введите подстроку: ");
        String substring = scanner.nextLine();

        // Вызываем метод и выводим результат
        int inclusions = countInclusions(string, substring);
        System.out.println("Количество вхождений: " + inclusions);
    }

    private static int countInclusions(String string, String substring) {
        string = string.toLowerCase(); // ищем без учета регистра
        substring = substring.toLowerCase();

        int count = 0;
        int index = 0;

        while ((index = string.indexOf(substring, index)) != -1) { // метод возвращает -1 если объект не найден
            count++;
            index += substring.length();
        }
        return count;
    }
}
