package day4.task3;


/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
 * матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
 * строк несколько, вывести индекс последней из них.
 */
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int lineIndex = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 51);
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                lineIndex = i;
            }
        }
        System.out.println(lineIndex);
    }
}
