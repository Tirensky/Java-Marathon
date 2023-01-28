package day14.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод
 * List<Person> parseFileToObjList(), который считывает содержимое того же
 * файла people.txt, создает экземпляры класса “Человек” и возвращает список
 * объектов. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо
 * этого, если значение возраста отрицательно, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */
public class Main {
    public static void main(String[] args) {
        String path = "src/day14/task3";
        File directory = new File(path);
        File file = new File(directory, "/people.txt");
//        // write it once to create file in 'day14.task1' dir
//        try {
//            directory.mkdirs();
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        List<Human> result = parseFileToObjectList(file);
        System.out.println(result);
    }

    public static List<Human> parseFileToObjectList(File file) {
        List<Human> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                int age = Integer.parseInt(person[1]);
                if (age < 0) {
                    throw new IllegalArgumentException();
                }
                Human human = new Human(person[0], age);
                people.add(human);
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
