package ru.itmo.java.basics.lab6;

class TwoClient extends TwoHuman implements TwoInformation {
    private String bankName;

    public TwoClient(String firstName, String secondName, String bankName) {
        super(firstName, secondName);
        this.bankName = bankName;
    }

    @Override
    public void outputInformation() {
        System.out.println("Клиент: " + getFirstName() + " " + getSecondName() + ", Банк: " + bankName);
    }

}
