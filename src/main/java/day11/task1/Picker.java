package day11.task1;

// Каждый раз, когда сотрудник выполняет свою работу (вызов метода doWork()), ему выплачивается
// заработная плата (сокр. ЗП) (80 — сборщику, 100 — курьеру).
// Также, при вызове doWork() у Сборщика, происходит увеличение значения поля
// countPickedOrders в объекте класса Warehouse на 1. А при вызове doWork() у Курьера, происходит
// увеличение значения поля countDeliveredOrders в объекте класса Warehouse на 1.
// Подумайте о том, как связать объекты работников с объектом склада
// (один из возможных вариантов - передавать объект склада в качестве аргумента при создании
// объектов-работников и хранить его в поле).
public class Picker implements Worker {

    private int salary;
    private int orderForBonus = 10000;
    private Warehouse warehouse;
    private boolean isBonus = true;


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders();
        if (warehouse.getCountPickedOrders() % orderForBonus == 0) {
            isBonus = true;
        }
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() % 10000 == 0  && isBonus) {
            salary += 70000;
            isBonus = false;
            orderForBonus+=orderForBonus;
        } else if (isBonus && warehouse.getCountPickedOrders() < orderForBonus) {
            System.out.println("Бонус пока не доступен");
        }
        else {
            System.out.println("Бонус уже был выплачен");
        }
    }

    public String toString() {
        return "Picker {" +
                "salary= " + salary +
                '}';
    }
}
