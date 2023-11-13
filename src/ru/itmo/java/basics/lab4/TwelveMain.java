package ru.itmo.java.basics.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class TwelveMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива целых чисел: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива (целые числа):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // вызов метода сортировки слиянием, возвращаем массив из элементов int
        int[] sortedArray = mergeSort(array);

        System.out.println("После сортировки СЛИЯНИЕМ\n" + Arrays.toString(sortedArray));
    }


    // СОРТИРОВКА СЛИЯНИЕМ - состоит из 2 методов: 1 разбивает, 2 соединяет

    // метод mergeSort возвращает массив, но уже отсортированный
    // этот метод ризбивает массив на 2 части, пока каждая часть не будет состоять из 1 элемента
    public static int[] mergeSort(int[] ints2) {
        System.out.println(Arrays.toString(ints2));

        if (ints2.length < 2) { // если длина массива состоит из 1 элемента, то возвращаем его же обратно
            return ints2;
        }

        int mid = ints2.length / 2; // определяем середину массива,
        // в любом случае даже если элементов нечетное кол-во операция даст целое число
        int[] left = new int[mid]; // определяем кол-во элементов левой части (она сама есть массив)
        // левая часть равна половине (ОКРУГЛЯЕТ В МЕНЬШУЮ СТОРОНУ, отсекая десятки)

        int[] right; // правую часть (массив) обозначаем здесь, чтобы она была "видна"
        // но определяем её длину по условию ниже

        if (ints2.length % 2 == 0) { // если кол-во элементов во всём массиве Четное, то
            right = new int[mid]; // длина правой части равна половине

        } else { // еесли кол-во элементов во всём массиве НЕчетное, то
            right = new int[mid + 1]; // длина правой части равна половина+1
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = ints2[i]; // переносим в левую часть все элементы
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = ints2[mid + i]; // переносим в правую часть все элементы от середины
        }

        left = mergeSort(left); // это РЕКУРСИЯ, т.е. метод mergeSort вызывает себя внутри самого себя
        right = mergeSort(right); // на рекурсию указывает круговая стрелочка слева на панели
        // рекурсия здесь потому что для каждого образовавшегося подмассива нам нужно выполнить операцию его разделения

        return mergeParts(left, right); // передаём все образовавшиеся части из 1 элемента в метод mergeParts
    }

    // этот метод собирает все части воедино
    public static int[] mergeParts(int[] left, int[] right) {
        // результирующий массив равен длине двух массивов, котореы пришли на вход
        int[] result = new int[left.length + right.length];

        // объявляем 3 указателя
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result; // возвращаем результирующий массив
    }
}
