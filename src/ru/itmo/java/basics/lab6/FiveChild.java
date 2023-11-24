package ru.itmo.java.basics.lab6;

public class FiveChild extends FiveParent {
    @Override
    public int getInfo() {
        System.out.print("Введите ваше имя: ");
        String name = scanner.next();
        getName(name);
        int age = super.getInfo();
        return age;
    }

    public void getName(String name) {
        System.out.println("Имя: " + name);
    }
}
