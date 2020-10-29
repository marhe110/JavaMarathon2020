//3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.
//
// Пример сгенерированной матрицы (для простоты m=3, n=5):
//
//        3 2 1 5 7 	// сумма - 18
//        1 2 5 6 2 	// сумма - 16
//        3 4 9 6 4	// сумма - 26
//
// Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print("  " + array[i][j]);
            }
            System.out.println();
        }
        int maxSumLengthStr = 0;
        int indMaxSumLengthStr = 0;
        int[] sumStr = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
                sumStr[i] += array[i][j];
            }
            if (maxSumLengthStr < sumStr[i]){
                maxSumLengthStr = sumStr[i];
                indMaxSumLengthStr = i;
            }
        }

//        System.out.println(Arrays.toString(sumStr));
//        System.out.println("Mах сумма элементов строки"maxSumLengthStr);
        System.out.printf("Ответ: %d (индекс строки, сумма чисел в которой максимальна)", indMaxSumLengthStr);
    }
}


