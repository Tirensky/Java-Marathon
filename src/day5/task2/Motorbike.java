package day5.task2;

public class Motorbike {
    private int year;
    private String color;
    private String brand;

    public Motorbike(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
