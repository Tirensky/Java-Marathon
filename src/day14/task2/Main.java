package day14.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *  Создать в папке проекта файл people.txt в котором хранятся имена и возраст
 * людей. Реализовать статический метод
 * List<String> parseFileToStringList(), который считывает содержимое этого
 * файла и возвращает список, состоящий из значений имен и возрастов каждого
 * человека. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо
 * этого, если значение возраста отрицательно, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 * Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]
 */
public class Main {
    public static void main(String[] args) {
        String path = "src/day14/task2";
        File directory = new File(path);
        File file = new File(directory, "/people.txt");
//        // write it once to create file in 'day14.task1' dir
//        try {
//            directory.mkdirs();
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        List<String> result = parseFileToStringList(file);
        System.out.println(result);
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                int age = Integer.parseInt(person[1]);
                if (age < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
