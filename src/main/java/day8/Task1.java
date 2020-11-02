//Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка,
// полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
//        После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль
//        сразу все числа из диапазона:
//        0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
//
//        Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк
//        (класс String) и использовании StringBuilder,
//        реализуйте описанную задачу этими двумя способами, замеряя время работы программы.

        package day8;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(strBild1());
        System.out.println(strBild2());
        System.out.println(concatenate());

    }
    static Long strBild1(){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 20000; i++) {
            sb.append(i).append(" ");
        }
        long start = System.currentTimeMillis();
        System.out.println(sb.toString());
        long finish = System.currentTimeMillis();
        return finish - start;
    }
    static long strBild2() {
        StringBuilder sb = new StringBuilder("");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.append(i+ " ");
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
    static long concatenate(){
         String str ="";

        for (int i = 0; i < 20000; i++) {
            str += i + " ";
        }
        long start = System.currentTimeMillis();
        System.out.println(str);
        long finish = System.currentTimeMillis();
        return finish - start;

    }
}
