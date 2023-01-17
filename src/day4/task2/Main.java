package day4.task2;


/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 * Использовать сортировку запрещено.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int valueEndsWith0 = 0;
        int sum = 0;
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            } else if (minValue > num) {
                minValue = num;
            }
            if (num % 10 == 0) {
                sum += num;
                valueEndsWith0++;
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(valueEndsWith0);
        System.out.println(sum);
    }
}
