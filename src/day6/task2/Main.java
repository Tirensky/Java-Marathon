package day6.task2;

/**
 * Создать класс Самолет (Airplane) с полями:
 * - producer (изготовитель)
 * - year (год выпуска)
 * - length (длина)
 * - weight (вес)
 * - fuel (количество топлива в баке) + геттер для этого поля
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения
 * четырех полей класса (значение поля “количество топлива в баке” установить равным
 * 0). В конструкторе для передачи полям значений использовать ключевое слово this.
 * Помимо этого, в классе необходимо реализовать метод info(), который выводит
 * сообщение в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
 * Также, необходимо реализовать метод fillUp(), который в качестве аргумента
 * принимает число и заправляет топливный бак самолета на это значение.
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два
 * раза, передав разные значения. Вызвать метод info().
 */
public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airway", 1999, 12.4f, 1335.34f);
        airplane.info();
        airplane.fillUp(50);
        airplane.info();
    }
}
