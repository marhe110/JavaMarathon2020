package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;

    public Airplane(String producer,
                    int year,
                    int length,
                    int weight) {

        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel;
    }

    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer
                + ", год выпуска: " + year
                + ", длина: " + length
                + ", вес: " + weight
                + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;

    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane1.length < airplane2.length) {
            System.out.println("Второй самолет длиннее");
        } else System.out.println("Длины самолетов равны");
    }
}
