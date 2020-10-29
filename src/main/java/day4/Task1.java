/*
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
 и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль,
 а также вывести в консоль информацию о:
        а) Длине массива
        б) Количестве чисел больше 8
        в) Количестве чисел равных 1
        г) Количестве четных чисел
        д) Количестве нечетных чисел
        е) Сумме всех элементов массива

        Пример:
        Введено число 10. Сгенерирован следующий массив:
        [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

        Информация о массиве:
        Длина массива: 10
        Количество чисел больше 8: 1
        Количество чисел равных 1: 0
        Количество четных чисел: 6
        Количество нечетных чисел: 4
        Сумма всех элементов массива: 46
*/
package day4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        //initialization
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mas = new int[size];
        Random rand = new Random();
        System.out.printf("Введено число %d. Сгенерирован следующий массив: \n", size);
        for (int i = 0; i < size; i++) {
            mas[i] = rand.nextInt(10);
            //System.out.print(mas[i]+ " ");
        }
        System.out.print(Arrays.toString(mas));


        int more8 = 0;
        int equally1 = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int sumAll = 0;

        System.out.println();
        for (int value : mas) {
            sumAll += mas[value];
            if (mas[value] > 8) { more8++; }

            if (mas[value] == 1) { equally1++; }

            if (mas[value] % 2 == 0) { evenNumber++; }
            else { oddNumber++; }
        }

        System.out.println("Информация о массиве");
        System.out.println("Длина массива: " + size);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + equally1);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива: " + sumAll);
    }
}
