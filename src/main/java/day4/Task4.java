//4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
// Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной
// суммой выведите значение суммы и индекс первого элемента тройки.
// Пример:
// *Для простоты пример показан на массиве размера 10
// [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//
// Тройка с максимальной суммой: [2789, 4, 8742]
// Вывод в консоль:
//        11535
//        5
//
// *Пояснение. Первое число - сумма тройки [2789, 4, 8742]. Второе число - индекс первого элемента тройки,
// то есть индекс числа 2789.
package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int lengthArray = 100;
        int maxRandom = 10000;
        int[] array = new int[lengthArray];
        Random random = new Random();

        for (int i = 0; i < lengthArray; i++) {
            array[i] = random.nextInt(maxRandom);
//            System.out.print(array[i] + " ");
        }
//        System.out.println();

        int maxSumOfThree = 0;
        int indMaxSumOfThree = 0;
        int sumOfThree = 0;
        for (int i = 1; i < lengthArray - 1; i++) {
            sumOfThree = array[i - 1] + array[i] + array[i + 1];
            if (maxSumOfThree < sumOfThree) {
                maxSumOfThree = sumOfThree;
                indMaxSumOfThree = i - 1;
            }
        }
        System.out.println(maxSumOfThree);
        System.out.println(indMaxSumOfThree);

    }
}
