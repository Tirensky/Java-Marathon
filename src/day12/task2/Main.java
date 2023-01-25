package day12.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
 * Вывести список.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= 350; i += 2) {
            if (i <= 30 || i >= 300) {
                evenNumbers.add(i);
            }
        }
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
    }
}
