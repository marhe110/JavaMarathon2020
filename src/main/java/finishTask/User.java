package finishTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private Battlefield battlefield;// поле боя
    private List<Ship> shipsList;// список кораблей
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public User(String name) throws IOException {
        this.name = name;
        initializeShips();
        initBattlefield();

    }

    //создаем массив кораблей
    private void initializeShips() throws IOException {
        shipsList = new ArrayList<>();
        for (int i = 4; i > 0; i--) {
              shipsList.add(new Ship(i));
              shipsList.add(new Ship(i));
        }


    }

    @Override
    public String toString() {
        return name + battlefield.print();
    }

    //инициализация поля
    public void initBattlefield() {
        battlefield = new Battlefield();
    }

}