package day19;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Battlefield battlefield; //= new Battlefield();// поле боя
    private List<Ship> shipsList;// список кораблей

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public User(String name) {
        this.name = name;
        initBattlefield();
        initializeShips();

    }


    //создаем массив кораблей
    //ДОБАВИТЬ после каждого созданного корабля проверить не заняты ли эти координаты кораблем или ореолом
    private void initializeShips() {
        int countShips = 0;
        int count = 0;
        shipsList = new ArrayList<>();
        for (int i = 4; i > 0; i--) {
            switch (i) {
                case 1:
                    countShips = 4;
                    break;
                case 2:
                    countShips = 3;
                    break;
                case 3:
                    countShips = 2;
                    break;
                case 4:
                    countShips = 1;
                    break;
            }
            while (countShips > count) {
                while (true) {
                    Ship ship = new Ship(i);
                    if (battlefield.addShipsOnBattlefield(ship)) { //выполнять если нет ошибок
                        shipsList.add(ship);
                        //прорисовать на поле последний добавленны корабль
                        battlefield.print();
                        break;
                    } else {
                        System.out.println("Ошибка ввода координат, повторить ввод координат для корабля сначала");
                    }
                }
                count++;
            }
            count = 0;
        }
    }

    @Override
    public String toString() {
        return name + battlefield.print();
    }

    //инициализация поля
    private void initBattlefield() {
        this.battlefield = new Battlefield();

    }

}


