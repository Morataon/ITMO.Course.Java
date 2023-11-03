package ru.itmo.java.basics.lab3;

public class OneMain {
    public static void main(String[] args) {
        // Создаем объект класса Study и устанавливаем значение поля "course"
        OneStudy oneStudy = new OneStudy("Изучение Java - это просто!");

        // Вызываем метод printCourse для вывода значения поля "course"
        System.out.println(oneStudy.printCourse());
    }
}
