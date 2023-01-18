package day5.task1;

/**
 * Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setYear(1985);
        car.setColor("Black");
        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
    }
}
