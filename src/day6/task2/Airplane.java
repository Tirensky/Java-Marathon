package day6.task2;

public class Airplane {
    private String producer;
    private int year;
    private float length;
    private float weight;
    private int fuel = 0;

    public Airplane(String producer, int year, float length, float weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        String str = "Изготовитель: %s, год выпуска: %d, длина: %.2f, вес: %.2f, количество топлива в баке: %d\n";
        System.out.printf(str, producer, year, length, weight, fuel);
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }
}
