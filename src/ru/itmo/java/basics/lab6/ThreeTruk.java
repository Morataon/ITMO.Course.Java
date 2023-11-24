package ru.itmo.java.basics.lab6;

public class ThreeTruk extends ThreeCar {

    private int weelsQuantity;
    private double maxWeight;

    public ThreeTruk(int weight, String model, char color, float speed, int weelsQuantity, double maxWeight) {
        super(weight, model, color, speed);
        this.weelsQuantity = weelsQuantity;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес грузовика: " + weelsQuantity);
        System.out.println("Максимальный вес грузовика: " + maxWeight);
    }

    public void newWeels(int newWeelsQuantity) {
        this.weelsQuantity = newWeelsQuantity;
        System.out.println("Новое количество колес грузовика: " + newWeelsQuantity);
    }
}
