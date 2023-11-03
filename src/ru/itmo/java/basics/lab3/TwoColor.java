package ru.itmo.java.basics.lab3;

public enum TwoColor {
    WHITE("Белый"),
    BLACK ("Черный"),
    RED ("Красный"),
    ORANGE ("Оранжевый"),
    GREEN ("Зеленый"),
    YELLOW ("Желтый"),
    WHITE_BLUE ("Голубой"),
    BLUE ("Синий"),
    VIOLET ("Фиолетовый");

    private final String description;

    TwoColor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

