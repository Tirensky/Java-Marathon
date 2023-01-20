package day7.task1;

/**
 * Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
 * дня.
 * В классе Самолет создать статический метод compareAirplanes, который в
 * качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 * сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airway", 1999, 128.4f, 1335.34f);
        Airplane airplane2 = new Airplane("Brofly", 2015, 128.44f, 1335.34f);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
