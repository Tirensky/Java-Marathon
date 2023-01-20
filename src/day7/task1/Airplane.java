package day7.task1;

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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        double threshold = 0.001;
        if (airplane1.length > airplane2.length) {
            System.out.printf("Самолёт производства %s длиннее\n", airplane1.producer);
        } else if (airplane2.length > airplane1.length) {
            System.out.printf("Самолёт производства %s длиннее\n", airplane2.producer);
        } else if (Math.abs(airplane1.length - airplane2.length) < threshold) {
            System.out.println("Самолёты равны");
        }
    }
}
