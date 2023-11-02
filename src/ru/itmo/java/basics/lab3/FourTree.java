package ru.itmo.java.basics.lab3;

public class FourTree {
    private Integer age;
    private Boolean alive;
    private String name;

    public FourTree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public FourTree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public FourTree(Integer age, Boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FourTree{" +
                "age=" + age +
                ", alive=" + alive +
                ", name='" + name + '\'' +
                '}';
    }
}
