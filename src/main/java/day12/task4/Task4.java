//4.  *Выполнять в подпапке task4 в day12*
// Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять
// и удалять участников. Под участником понимается строка (String) с именем и фамилией.
// Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
// Название метода: transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
// Реализовать метод printMembers (в классе MusicBand), выводящий список участников в консоль.
// Проверить состав групп после слияния.
package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        List<String> fullName1 = new ArrayList<>();
        fullName1.add("Князев Адрей");
        fullName1.add("Насквидашвилли Дмитрий");

        List<String> fullName2 = new ArrayList<>();
        fullName1.add("Шнуров Сергей");
        fullName1.add("Ольхова Мария");
        fullName1.add("Кузьмина Виктория");

        list.add(new MusicBand("КняZz", 2011, fullName1));
        list.add(new MusicBand("Ленинград", 1997, fullName2));

        MusicBand.transferMembers(list.get(0), list.get(1));
        list.get(1).printMembers();

    }
}
