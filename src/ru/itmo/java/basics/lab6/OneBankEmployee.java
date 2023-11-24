package ru.itmo.java.basics.lab6;

public class OneBankEmployee extends OneHuman {

    private String bankName;

    public OneBankEmployee(String firstName, String secondName, String bankName) {
        super(firstName, secondName);
        this.bankName = bankName;
    }

    @Override
    void getInfo() {
        System.out.println("Работник банка: " + getFirstName() + " " + getSecondName() + ", Банк: " + bankName);
    }
}
