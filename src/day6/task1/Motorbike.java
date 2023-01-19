package day6.task1;

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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int currentYear) {
        return Math.abs(this.year - currentYear);
    }
}
