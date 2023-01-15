package day2.task1;

import java.util.Scanner;

/**
 * Реализовать программу, которая принимает на вход через консоль с помощью
 * класса Scanner, число, соответствующее количеству этажей в здании. Используя
 * условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
 * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
 * - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
 * отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = scan.nextInt();
        String result = "";
        if (floor <= 4 && floor > 0) {
            result = "Малоэтажный дом";
        } else if (floor >= 5 && floor <= 8) {
            result = "Среднеэтажный дом";
        } else if (floor >= 9) {
            result = "Многоэтажный дом";
        } else {
            result = "Ошибка ввода";
        }
        System.out.println(result);
        scan.close();
    }
}
