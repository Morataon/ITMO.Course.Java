package ru.itmo.java.basics.lab3;

import java.util.Calendar;

public class ThreeMain {

    public static void main(String[] args) {
        ThreeBuilding building1 = new ThreeBuilding();
        building1.setName("penthouse");
        building1.setFloor(2);
        building1.setYear(2015);
        String name1 = building1.getName();
        Integer floor1 = building1.getFloor();
        Integer year1 = building1.getYear();
        Integer age1 = age(year1);

        System.out.println("Параметры здания 1: " + "наименование - " + name1 + ", " + "этажность - " + floor1 + ", " + "год постройки - " + year1 + ", " + "кол-во лет с момента постройки - " + age1);

        ThreeBuilding building2 = new ThreeBuilding();
        building2.setName("skyscraper");
        building2.setFloor(255);
        building2.setYear(2022);
        String name2 = building2.getName();
        Integer floor2 = building2.getFloor();
        Integer year2 = building2.getYear();
        Integer age2 = age(year2);

        System.out.println("Параметры здания 2: " + "наименование - " + name2 + ", " + "этажность - " + floor2 + ", " + "год постройки - " + year2 + ", " + "кол-во лет с момента постройки - " + age2);

    }

    public static Integer age(Integer year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;
        return age;
    }
}
