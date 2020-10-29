/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Затем, используя циклы for each вывести:
        наибольший элемент массива
        наименьший элемент массива
        количество элементов массива, оканчивающихся на 0
        сумму элементов массива, оканчивающихся на 0

        Использовать сортировку запрещено.
*/

package day4;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //initialization
        Scanner scanner = new Scanner(System.in);
        int size = 100;
        int[] mas = new int[size];
        Random rand = new Random();
        System.out.printf("Размер массива %d.\n", size);
        for (int i = 0; i < size; i++) {
            mas[i] = rand.nextInt(10000);
//            System.out.print(mas[i]+ " ");
        }
//            System.out.println();
        int max = 0;
        int min = 0;
        int countValDiv10 = 0;
        int sumValDiv10 = 0;
        for (int value : mas) {
            max = Math.max(value, max);
            min = Math.min(value, min);
            if (value % 10 == 0) {
                countValDiv10++;
                sumValDiv10 += value;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countValDiv10);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumValDiv10);

    }
}
