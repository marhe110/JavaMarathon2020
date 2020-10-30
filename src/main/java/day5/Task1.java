//1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
// задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//        Созданный вами класс должен отвечать принципам инкапсуляции.
package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("black");
        car1.setModel("Volga");
        car1.setYear(1996);

        System.out.println(car1.getModel() + " " + car1.getColor() + " " + car1.getYear());
    }
}
