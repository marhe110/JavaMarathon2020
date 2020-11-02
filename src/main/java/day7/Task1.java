//1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
//        В классе Самолет создать статический метод compareAirplanes,
//        который в качестве аргументов принимает два объекта
//        класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("boeing", 2000, 100, 2000);
        Airplane airplane2 = new Airplane("Cessna", 1950, 25, 700);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}