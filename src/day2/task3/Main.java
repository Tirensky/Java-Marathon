package day2.task3;

import java.util.Scanner;

/**
 *     {  (x^2 - 10) / (x + 7),   x >= 5
 * y = { (x + 3) * (x^2 - 2),    -3 < x < 5
 *     {  420,                    other cases
 * Реализовать программу, которая принимает на вход через консоль с помощью класса
 * Scanner, число x. Для этого числа, по формуле выше, необходимо вычислить
 * значение y.
 * (Для этих вещественных чисел x и y необходимо использовать тип double и метод
 * nextDouble() у Scanner’а соответственно, чтобы считать из консоли число x).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();
        double y = 0;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (x < 5 && x > -3) {
            y = (x + 3) * (x * x - 2);
        } else {
            y = 420;
        }
        System.out.println(y);
        scan.close();
    }
}
