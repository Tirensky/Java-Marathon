package day3.taks2;

import java.util.Scanner;

/**
 * Реализовать программу, которая пока работает, принимает на вход от пользователя
 * два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
 * результат деления и выводит его в консоль. Программа останавливает свою работу
 * тогда, когда пользователь вводит 0 в качестве делителя.
 * (для этих вещественных чисел необходимо использовать тип double и метод
 * nextDouble() у Scanner’а соответственно).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double number1 = scan.nextDouble();
            double number2 = scan.nextDouble();
            if (number2 == 0) {
                break;
            }
            System.out.println(number1 / number2);
        }
        scan.close();
    }
}
