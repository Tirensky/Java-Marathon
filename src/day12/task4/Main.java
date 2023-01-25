package day12.task4;


import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
 * группу можно было добавлять и удалять участников. Под участником понимается
 * строка (String) с именем и фамилией. Реализовать статический метод слияния групп
 * (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
 * метода: transferMembers. Этот метод принимает в качестве аргументов два
 * экземпляра класса MusicBand. Реализовать метод printMembers (в классе
 * MusicBand), выводящий список участников в консоль. Проверить состав групп после
 * слияния.
 */
public class Main {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            members1.add("Name_" + i);
        }
        MusicBand musicBands1 = new MusicBand("Band1", 1993, members1);

        List<String> members2 = new ArrayList<>();
        for (int i = 3; i < 6; i++) {
            members2.add("Name_" + i);
        }
        MusicBand musicBands2 = new MusicBand("Band2", 2001, members2);
        musicBands1.printMembers();
        musicBands2.printMembers();
        System.out.println("----------");

        MusicBand.transferMembers(musicBands1, musicBands2);
        musicBands1.printMembers();
        musicBands2.printMembers();
        System.out.println("----------");

        musicBands2.addMember("HasName");
        musicBands2.removeMember("Name_4");
        musicBands2.printMembers();
    }
}
