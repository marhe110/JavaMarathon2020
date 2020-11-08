//2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
        package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (count <= 350){
            count++;
            if (count < 30 && count % 2 == 0){
                list.add(count);
            }
            if (count > 300 && count <= 350 && count % 2  == 0){
                list.add(count);
            }
        }
        System.out.println(list);
    }
}
