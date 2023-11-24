package ru.itmo.java.basics.lab6;

public class OneClient extends OneHuman {

    private String bankName;

    public OneClient(String firstName, String secondName, String bankName) {
        super(firstName, secondName);
        this.bankName = bankName;
    }

    @Override
    void getInfo() {
        System.out.println("Клиент: " + getFirstName() + " " + getSecondName() + ", Банк: " + bankName);
    }

}
