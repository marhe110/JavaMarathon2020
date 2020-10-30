//2. Создать класс Мотоцикл (англ. Motorbike),
// с  полями “Год выпуска”, “Цвет”, “Модель”.
// Создать экземпляр класса Мотоцикл,
// с помощью конструктора (сеттеры не использовать).
// Придерживаться принципов инкапсуляции и использовать
// ключевое слово this. Геттером получить год выпуска, цвет,
// модель, вывести значения в консоль.

package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Kavasaki ZZR400", "black", 1999);
        System.out.println(motorbike.getModel() + " " +
                motorbike.getColor() + " " +
                motorbike.getYear());
    }
}
