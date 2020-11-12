//1. Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
//        Заполнить его вручную десятью произвольными числами. Реализовать статический метод
//        printSumDigits(File file), который считает сумму всех чисел в этом файле и выводит ее
//        на экран. Вызвать данный метод в методе main().
//        Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
//        и выводить в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле
//        меньше или больше 10, необходимо выбрасывать исключение и выводить в консоль сообщение
//        “Некорректный входной файл”.

package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file");

        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static void printSumDigits(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String readline = scanner.nextLine();
        String[] numbersString = readline.split(" ");
        if (numbersString.length != 10) {
            throw new IOException();
        }

        int sum = 0;
        for (String number : numbersString) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
