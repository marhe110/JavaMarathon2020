/*3. Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод
List<Person> parseFileToObjList(), который считывает содержимое того же файла people.txt,
 создает экземпляры класса “Человек” и возвращает список объектов. Получить данный список в
 методе main() и распечатать его в консоль.
        В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать
        исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение
        возраста отрицательно, необходимо выбрасывать исключение и выводить в консоль сообщение
        “Некорректный входной файл”.


        Пример ответа: [{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20},
        {name='Miguel', year=5}]*/

package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }



    public static List<Person> parseFileToObjList() {
        try {
            List<Person> personList = new ArrayList<>();
            File file = new File("people.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String readline = scanner.nextLine();
                String[] person = readline.split(" ");
                if (Integer.parseInt(person[1]) <= 0) {
                    throw new IllegalArgumentException();
                }
                personList.add(new Person(person[0], Integer.parseInt(person[1])));
            }
            return personList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (
                IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
