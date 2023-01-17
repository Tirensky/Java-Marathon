package day4.task4;

import java.util.Arrays;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 * максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int maximumSum = 0;
        int sum = 0;
        int index = 0;
        // Outputs array elements
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 2; i++) {
            sum += array[i] + array[i + 1] + array[i + 2];
            if (sum > maximumSum) {
                maximumSum = sum;
                // Outputs 3 elements and its sum
//                System.out.println(array[i] +" "+ array[i + 1] +" "+ array[i + 2] + " :: " + maximumSum);
                index = i;
            }
            sum = 0;
        }
        System.out.println(index);
    }
}
