package ru.itmo.java.basics.lab3;

public class TwoMain {
    public static void main (String[] args) {
        // создаем 1 объект используя пустой конструктор
    TwoSimpleClass twoSimpleClass = new TwoSimpleClass();
        twoSimpleClass.setName("ВАЗ");
        twoSimpleClass.setTwoColor(TwoColor.GREEN);
        twoSimpleClass.setWeight(950.5);

        System.out.println(twoSimpleClass);

        // создаем 2 объект используя конструктор "цвет"
        TwoSimpleClass twoSimpleClass2 = new TwoSimpleClass(TwoColor.RED);
        System.out.println(twoSimpleClass2);

        // создаем 3 объект используя конструктор "цвет+вес"
        TwoSimpleClass twoSimpleClass3 = new TwoSimpleClass(TwoColor.VIOLET, 1340.67);
        System.out.println(twoSimpleClass3);
    }
}
