package day6.task1;

/**
 * В классах Автомобиль и Мотоцикл реализовать два метода:
 * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference() - принимает на вход число (год), и возвращает разницу между
 * переданным годом и годом выпуска транспортного средства
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setYear(2010);
        car2.setYear(1870);
        car1.info();
        System.out.println("Разница между годами выпуска: " +
                car1.yearDifference(car2.getYear()));

        Motorbike motorbike1 = new Motorbike("Moto", "Red", 1989);
        Motorbike motorbike2 = new Motorbike("Moto", "Green", 1977);
        motorbike2.info();
        System.out.println("Разница между годами выпуска: " +
                motorbike1.yearDifference(motorbike2.getYear()));

    }
}
