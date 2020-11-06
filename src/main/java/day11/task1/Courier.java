package day11.task1;

public class Courier implements Worker {
    private int salary;

    private int orderForBonus = 10000;
    private int paymentAmount = 0;
    Warehouse warehouse;
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
    }

    @Override
    public String toString() {
        return "Courier {" +
                "salary= " + salary +
                '}';
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() % 10000 == 0 && paymentAmount < warehouse.getCountPickedOrders()) {
            paymentAmount += orderForBonus;
            salary += 50000;
            //System.out.println("bonus выплачен сейчас");
        } else if (paymentAmount < warehouse.getCountPickedOrders()) {
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }


}