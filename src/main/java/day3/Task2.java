/*
2. Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль. Программа останавливает
свою работу тогда, когда пользователь вводит 0 в качестве делителя.
        (для этих вещественных чисел необходимо использовать тип double и метод nextDouble()
        у Scanner’а соответственно).

        Пример:
        1 2 - ваш ввод в консоль
        0.5 - ответ программы
        100 77 - ваш ввод в консоль
        1.2987012987012987 - ответ программы
        3 0 - ваш ввод в консоль
        работа программы завершается
*/

package day3;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Double del = scanner.nextDouble();
            Double del2 = scanner.nextDouble();
            if (del2 != 0) {
                System.out.println(del / del2);
            } else {
                break;

            }
        }

    }
}
