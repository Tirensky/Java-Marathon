package day1.task1;

/**
 * Вывести на экран слово “JAVA” (с пробелами), в строку, чтобы оно
 * повторилось 10 раз, используя цикл while.
 */
public class Main {
    public static void main(String[] args) {
        int counter = 10;
        while (counter > 0) {
            System.out.print("JAVA");
            if (counter > 1) {
                System.out.print(" ");
            } else {
                System.out.println("");
            }
            counter--;
        }
    }
}
