package day15;

public class Shoes {
    private String name;
    private int size;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public Shoes(String name, int size, int amount) {
        this.name = name;
        this.size = size;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return name + ", " +
                + size + ", " +
                + amount;
    }
}
