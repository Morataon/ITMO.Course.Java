package ru.itmo.java.basics.lab6;

public class FourChild extends FourParent {
    public FourChild(int i) {
        super(i);
    }

    public void print() {
        System.out.println("Переменная из родительского класса: " + i);
    }

}
