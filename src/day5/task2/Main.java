package day5.task2;

/**
 * Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 * слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
 * консоль.
 */
public class Main {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "Red", 1995);
        System.out.println(motorbike.getBrand());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getYear());
    }
}
