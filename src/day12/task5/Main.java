package day12.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника
 * музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
 * участником понимается не строка, а объект класса MusicArtist. Необходимо
 * реализовать класс MusicArtist и доработать класс MusicBand (создать копию
 * класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
 * этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
 * проверить состав групп после слияния. Методы для слияния и для вывода участников
 * в консоль необходимо тоже переработать, чтобы они работали с объектами класса
 * MusicArtist
 */
public class Main {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            members1.add(new MusicArtist("Name_" + i, (int) (Math.random() * 36 + 14)));
        }
        MusicBand musicBand1 = new MusicBand("Band1", 1966, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        for (int i = 3; i < 6; i++) {
            members2.add(new MusicArtist("Name_" + i, (int) (Math.random() * 36 + 14)));
        }
        MusicBand musicBand2 = new MusicBand("Band2", 2001, members2);
        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
