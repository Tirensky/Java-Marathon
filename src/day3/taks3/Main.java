package day3.taks3;

import java.util.Scanner;

/**
 * Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
 * делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
 * и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
 * того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
 * выводим в консоль сообщение “Деление на 0”.
 * Ключевое слово else использовать в этой программе нельзя.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 5;
        while (counter > 0) {
            double number1 = scan.nextDouble();
            double number2 = scan.nextDouble();
            if (number2 == 0) {
                System.out.println("Деление на 0");
                counter--;
                continue;
            }
            System.out.println(number1 / number2);
            counter--;
        }
        scan.close();
    }
}
