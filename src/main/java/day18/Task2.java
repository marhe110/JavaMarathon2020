//2. Создайте рекурсивный метод, который принимает на вход единственный аргумент - число,
// и возвращает количество цифр 7 в этом числе. Циклы использовать запрещено, можно использовать
// только рекурсивные вызовы.
//
//        Пример:
//        System.out.println(count7(717771237)); // 5
//
//        *В числе 717771237 ровно 5 раз используется цифра семь.
//   --------------------------------------------------------------------------------------------------------------------
        package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(76722707));
    }
    public static int count7(int value) {
        if (value == 0) {
            return 0;
        }

        if (value % 10 == 7) {
            value = 1 + count7(value / 10);
        } else {
            value = count7(value / 10);
        }
        return value;
    }
}
