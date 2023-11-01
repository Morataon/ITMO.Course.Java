package ru.itmo.java.basics.lab2;

public class HostMain {
    public static void main(String[] args) {

        Host host = new Host();

        Host host1 = new Host(1, "Николай", "Смирнов", "smirnov@mail.ru", "jUk@4f91d", 1990, true);

        Host host2 = new Host(2, "Олег", "timofeev@mail.ru", "ladhh@lad5");

        System.out.println(host);
        System.out.println(host1);
        System.out.println(host2);
    }
}
