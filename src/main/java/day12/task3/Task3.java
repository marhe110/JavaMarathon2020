//*Выполнять в подпапке task3 в day12*
//        Создать класс Музыкальная Группа (англ. MusicBand)
//        с полями name и year (название музыкальной группы и год основания).
//        Создать 10 или более экземпляров класса MusicBand ,
//        добавить их в список (выбирайте такие музыкальные группы, которые были созданы как до 2000 года,
//        так и после, жанр не важен). Перемешать список. Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//        Этот метод принимает список групп в качестве аргумента и возвращает новый список,
//        состоящий из групп, основанных после 2000 года.
//        Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
//        Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).


package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        List<MusicBand> list2;

        list.add(new MusicBand("Pendulum", 2002));
        list.add(new MusicBand("Руки вверх", 1996));
        list.add(new MusicBand("Beastie Boys", 1979));
        list.add(new MusicBand("Тату", 1999));
        list.add(new MusicBand("Слот", 2002));
        list.add(new MusicBand("Иванушки International", 1995));
        list.add(new MusicBand("КняZz", 2011));
        list.add(new MusicBand("Ленинград", 1997));
        list.add(new MusicBand("Пилот", 1997));
        list.add(new MusicBand("Bomfunk MC", 1998));

        list2 = groupsAfter2000(list);
        for (MusicBand musicBand : list) {
            System.out.print(musicBand);
        }
        System.out.println();
        System.out.println();

        for (MusicBand musicBand : list2) {
            System.out.print(musicBand);
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        Collections.shuffle(bands);
        List<MusicBand> bands2 = new ArrayList<>();
        int i = 0;
        while (i <= bands.size() - 1) {
            if (bands.get(i).getYear() >= 2000) {
                bands2.add(bands.get(i));
            }
            i++;
        }
        return bands2;
    }
}