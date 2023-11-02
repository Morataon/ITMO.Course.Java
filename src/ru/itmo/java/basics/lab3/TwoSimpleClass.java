package ru.itmo.java.basics.lab3;

public class TwoSimpleClass {
    private String name;
    private TwoColor twoColor;
    private Double weight;

    // конструктор для цвета авто
    public TwoSimpleClass(TwoColor twoColor) {
        this.twoColor = twoColor;
    }

    // конструктор для цвета и веса авто
    public TwoSimpleClass(TwoColor twoColor, Double weight) {
        this.twoColor = twoColor;
        this.weight = weight;
    }

    // пустой конструктор
    public TwoSimpleClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TwoColor getTwoColor() {
        return twoColor;
    }

    public void setTwoColor(TwoColor twoColor) {
        this.twoColor = twoColor;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TwoSimpleClass{" +
                "name='" + name + '\'' +
                ", twoColor=" + twoColor +
                ", weight=" + weight +
                '}';
    }
}
