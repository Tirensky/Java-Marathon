package day12.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 * из списка. Распечатать список.
 */
public class Main {
    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carBrands.add("Brand " + i);
        }
        for (String carBrand : carBrands) {
            System.out.println(carBrand);
        }
        System.out.println("---------------------");
        int index = carBrands.size() / 2;
        carBrands.add(index, "Another brand");
        carBrands.remove(0);
        for (String carBrand : carBrands) {
            System.out.println(carBrand);
        }
    }
}
