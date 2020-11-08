//5. *Выполнять в подпапке task5 в day12*
//        Скопировать MusicBand из прошлого задания и доработать - теперь у участника
//        музыкальной группы есть не только имя, но и возраст. Соответственно,
//        теперь под участником понимается не строка, а объект класса MusicArtist.
//        Необходимо реализовать класс MusicArtist и доработать класс MusicBand
//        (создать копию класса) таким образом, чтобы участники были - объекты класса MusicArtist.
//        После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы
//        и проверить состав групп после слияния. Методы для слияния и для вывода участников
//        в консоль необходимо тоже переработать, чтобы они работали с объектами класса
//        MusicArtist.

        package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        List<MusicArtist> fullName1 = new ArrayList<>();
        List<MusicArtist> fullName2 = new ArrayList<>();

        fullName1.add(new MusicArtist("Князев Адрей", 47) );
        fullName1.add(new MusicArtist("Насквидашвилли Дмитрий",43 ));

        fullName1.add(new MusicArtist("Шнуров Сергей",47 ));
        fullName1.add(new MusicArtist("Ольхова Мария", 31));
        fullName1.add(new MusicArtist("Кузьмина Виктория",37));

        list.add(new MusicBand("КняZz", 2011, fullName1));
        list.add(new MusicBand("Ленинград", 1997, fullName2));

        MusicBand.transferMembers(list.get(0), list.get(1));
        list.get(1).printMembers();
    }
}
