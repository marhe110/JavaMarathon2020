//Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
//Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Распечатать список.

package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> autoList = new ArrayList<>();
            autoList.add("Волга");
            autoList.add("Мерседес");
            autoList.add("Ауди");
            autoList.add("Таёта");
            autoList.add("Субару");
        System.out.println(autoList);
        autoList.add(2,"Ваз");
        autoList.remove(3);
        System.out.println(autoList);

    }


}
