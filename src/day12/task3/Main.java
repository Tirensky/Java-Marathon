package day12.task3;

import java.util.*;

/**
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 * (название музыкальной группы и год основания). Создать 10 или более экземпляров
 * класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 * которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 * список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand>
 * bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 * состоящий из групп, основанных после 2000 года. Вызвать метод
 * groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 * из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 * после 2000 года).
 */
public class Main {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            musicBands.add(new MusicBand("Band_" + i, (int) (Math.random() * 31 + 1984)));
        }
        for (MusicBand musicBand : musicBands) {
            System.out.println(musicBand);
        }
        System.out.println("------------------------");
        Collections.shuffle(musicBands);
        List<MusicBand> musicBandsAfter2000 = groupAfter2000(musicBands);
        for (MusicBand musicBandAfter2000 : musicBandsAfter2000) {
            System.out.println(musicBandAfter2000);
        }
    }

    public static List<MusicBand> groupAfter2000(List<MusicBand> bands) {
        List<MusicBand> copy = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getFoundationYear() > 2000) {
                copy.add(band);
            }
        }
        bands = copy;
        return bands;
    }
}
