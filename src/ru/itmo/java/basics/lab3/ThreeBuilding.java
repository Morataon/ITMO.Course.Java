package ru.itmo.java.basics.lab3;

public class ThreeBuilding {

    private Integer floor;
    private Integer year;
    private String name;

    public ThreeBuilding(){
    }

    public ThreeBuilding(Integer floor, Integer year, String name) {
        this.floor = floor;
        this.year = year;
        this.name = name;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ThreeBuilding{" +
                "floor=" + floor +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
