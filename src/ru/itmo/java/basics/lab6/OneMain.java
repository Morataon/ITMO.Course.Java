package ru.itmo.java.basics.lab6;

import java.util.Scanner;

public class OneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные клиента:");
        System.out.print("Имя: ");
        String firstNameClient = scanner.nextLine();
        System.out.print("Фамилия: ");
        String secondNameClient = scanner.nextLine();
        System.out.print("Название банка: ");
        String bankNameClient = scanner.nextLine();

        OneHuman client = new OneClient(firstNameClient, secondNameClient, bankNameClient);

        System.out.println("\nВведите данные работника банка:");
        System.out.print("Имя: ");
        String firstNameEmployee = scanner.nextLine();
        System.out.print("Фамилия: ");
        String secondNameEmployee = scanner.nextLine();
        System.out.print("Название банка: ");
        String bankNameEmployee = scanner.nextLine();

        OneHuman bankEmployee = new OneBankEmployee(firstNameEmployee, secondNameEmployee, bankNameEmployee);

        client.getInfo();
        bankEmployee.getInfo();
    }
}
