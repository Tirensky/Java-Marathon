package day4.task1;

import java.util.Arrays;
import java.util.Scanner;


/**
 *  С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        int valueMoreThen8 = 0;
        int valueEquals1 = 0;
        int evenValue = 0;
        int oddValue = 0;
        int sum = 0;
        for (int num : array) {
            if (num > 8) {
                valueMoreThen8++;
            }
            if (num == 1) {
                valueEquals1++;
            }
            if (num % 2 == 0) {
                evenValue++;
            } else {
                oddValue++;
            }
            sum += num;
        }
        System.out.println("Введено число " + len + ". Сгенерирован следующий массив:\n" + Arrays.toString(array));
        System.out.println(
                "Длина массива: " + array.length + "\n" +
                "Количество чисел больше 8: " + valueMoreThen8 + "\n" +
                "Количество чисел равных 1: " + valueEquals1 + "\n" +
                "Количество четных чисел: " + evenValue + "\n" +
                "Количество нечетных чисел: " + oddValue + "\n" +
                "Сумма всех элементов массива: " + sum
        );
        scan.close();
    }
}
