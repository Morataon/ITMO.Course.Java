package ru.itmo.java.basics.lab6;

public class TwoBankEmployee extends TwoHuman implements TwoInformation {
    private String bankName;

    public TwoBankEmployee(String firstName, String secondName, String bankName) {
        super(firstName, secondName);
        this.bankName = bankName;
    }

    @Override
    public void outputInformation() {
        System.out.println("Работник банка: " + getFirstName() + " " + getSecondName() + ", Банк: " + bankName);
    }
}
