package ru.itmo.java.basics.lab6;

public class FiveMain {
    public static void main(String[] args) {
        FiveChild childObject = new FiveChild();

        int userAge = childObject.getInfo();

        System.out.println("Ваш возраст: " + userAge);
    }
}
