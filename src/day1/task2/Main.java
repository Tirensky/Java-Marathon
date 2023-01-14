package day1.task2;

/**
 * Вывести на экран слово “JAVA” (с пробелами), в строку, чтобы оно
 * повторилось 10 раз, используя цикл while.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("JAVA");
            if (i < 9) {
                System.out.print(" ");
            } else {
                System.out.println("");
            }
        }
    }
}
