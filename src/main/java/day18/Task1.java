//        1. Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве
//        не используя циклы (необходимо использовать рекурсивные вызовы).
//
//        Пример:
//        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//        System.out.println(recursionSum(...)); // 65346
//
//        *recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.

package day18;

import java.util.Random;

public class Task1 {
        public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(100)];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100500);
        }
        System.out.println(recursionSum(array, 0));
    }

    public static int recursionSum(int[] array, int i) {
        if (i == array.length) {
            return 0;
        }
        return array[i] + recursionSum(array, i+1);
    }
}

