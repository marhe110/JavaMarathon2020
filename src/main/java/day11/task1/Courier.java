package day11.task1;

public class Courier implements Worker {

    private int salary;
    private int orderForBonus = 10000;
    private Warehouse warehouse;
    private boolean isBonus = true;


    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders();
        if (warehouse.getCountDeliveredOrders() % orderForBonus == 0) {
            isBonus = true;
        }
    }

    @Override
    public String toString() {
        return "Courier {" +
                "salary= " + salary +
                '}';
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() % 10000 == 0  && isBonus) {
            salary += 50000;
            isBonus = false;
            orderForBonus+=orderForBonus;
        } else if (isBonus && warehouse.getCountDeliveredOrders() < orderForBonus) {
            System.out.println("Бонус пока не доступен");
        }
        else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
